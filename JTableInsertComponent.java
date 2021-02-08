package java08_swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class JTableInsertComponent extends JFrame{
	 DefaultTableModel model;
	 JTable table; 
	 Vector data = new Vector();
	 Vector<String> colName = new Vector<String>();
	 public JTableInsertComponent(String title){
	  super(title);
	  display();
	  startEvent();
	  setSize(400,150);
	  setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	 }
	 public void dataSetting(){
	  colName.add("아이디");
	  colName.add("패스워드");
	  colName.add("성명");
	  colName.add("주소");
	  colName.add("메모");
	  colName.add("등록일");
	  colName.add("경력여부");
	  colName.add("예약하기");
	 }
	 public void showAllData(){
	  //MemberDAO dao = new MemberDAO();
	  //data = dao.selectTable();
	  Vector data = new Vector();
	  model.setDataVector(data, colName);
	 }
	 public void display(){
	  Container c = getContentPane();
	  
	  dataSetting();
	  
	  model = new DefaultTableModel(data, colName);
	  showAllData();
	  table = new JTable(model);
	  table.getColumnModel().getColumn(7).setPreferredWidth(150);
	  table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	  
	  JScrollPane scroll = new JScrollPane(table);
	  DefaultTableCellRenderer renderer = new Rendering();
	  table.getColumn("경력여부").setCellRenderer(renderer);
	  c.add(scroll,BorderLayout.CENTER);
	 }

	 public void startEvent(){
	  //table.addMouseListener(this);
	 }
	 public static void main(String[] args){
	  JTableInsertComponent obj = new JTableInsertComponent("테이블연습");
	 }
	}