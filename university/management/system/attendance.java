package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class attendance extends JFrame implements ActionListener {

    JTextField tfname, tfaddress, tfphone, tfemail;
    JDateChooser dcdob;
    JButton submit, cancel;
    JTextArea attendanceReport;
    DefaultListModel<String> studentListModel;
    JList<String> studentList;
    JComboBox<String> attendanceComboBox;

    public attendance() {
        setSize(900, 700);
        setLocation(350, 50);
        setLayout(null);

        JLabel heading = new JLabel("Student Attendance System");
        heading.setBounds(250, 30, 400, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lblname = new JLabel("Student Name");
        lblname.setBounds(50, 150, 150, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add(lblname);

        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);

        JLabel lbldob = new JLabel("Date of Birth");
        lbldob.setBounds(400, 150, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbldob);

        dcdob = new JDateChooser();
        dcdob.setBounds(600, 150, 150, 30);
        add(dcdob);

        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(50, 200, 150, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200, 200, 150, 30);
        add(tfaddress);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(400, 200, 150, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(600, 200, 150, 30);
        add(tfphone);

        JLabel lblemail = new JLabel("Email Id");
        lblemail.setBounds(50, 250, 150, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200, 250, 150, 30);
        add(tfemail);

        JLabel lblAttendance = new JLabel("Attendance Status");
        lblAttendance.setBounds(50, 300, 200, 30);
        lblAttendance.setFont(new Font("serif", Font.BOLD, 20));
        add(lblAttendance);

        String[] attendanceOptions = {"Present", "Absent"};
        attendanceComboBox = new JComboBox<>(attendanceOptions);
        attendanceComboBox.setBounds(200, 300, 150, 30);
        attendanceComboBox.setBackground(Color.WHITE);
        add(attendanceComboBox);

        submit = new JButton("Add Student");
        submit.setBounds(250, 350, 150, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        JLabel lblStudentList = new JLabel("Student List");
        lblStudentList.setBounds(50, 400, 200, 30);
        lblStudentList.setFont(new Font("serif", Font.BOLD, 20));
        add(lblStudentList);

        studentListModel = new DefaultListModel<>();
        studentList = new JList<>(studentListModel);
        studentList.setBounds(200, 400, 400, 150);
        studentList.setBackground(Color.LIGHT_GRAY);
        add(studentList);

        attendanceReport = new JTextArea();
        attendanceReport.setBounds(650, 400, 200, 150);
        attendanceReport.setEditable(false);
        add(attendanceReport);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 350, 150, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tfname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String attendance = (String) attendanceComboBox.getSelectedItem();

            String studentInfo = "Name: " + name + ", DOB: " + dob + ", Phone: " + phone + ", Email: " + email + ", Attendance: " + attendance;
            studentListModel.addElement(studentInfo);
            attendanceReport.append(studentInfo + "\n");

            // Optionally reset fields after adding
            tfname.setText("");
            tfaddress.setText("");
            tfphone.setText("");
            tfemail.setText("");
            dcdob.setDate(null);
            attendanceComboBox.setSelectedIndex(0);
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new attendance();
    }
}
