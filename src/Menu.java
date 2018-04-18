import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Menu extends JFrame implements ActionListener
{
  //variables de clase(de instancia)
  private JLabel e;
  private Font f;
  
  //constructor de clase
  Menu()
  {
    super("BARRA DE MENÚS EN JAVA");
    f = new Font("San Serif", Font.BOLD, 18);
    e = new JLabel("Ningún menú seleccionado", JLabel.CENTER);
    e.setFont(f);
    e.setBackground(Color.yellow);
    e.setOpaque(true);
    e.setForeground(Color.BLUE);
    
    //especificar contenedor (esquema)
    setLayout(new BorderLayout());
    add(e,BorderLayout.SOUTH);
    
    //imágenes para los menús
    ImageIcon i1 = new ImageIcon("src/cortar.png");
    ImageIcon i2 = new ImageIcon("src/copiar.jpg");
    ImageIcon i3 = new ImageIcon("src/pegar.jpg");
    
    //creación de un objeto barra de menú y se agrega al JFrame
    JMenuBar menuBar = new JMenuBar();
    this.setJMenuBar(menuBar);
    
    //creación de las cadenas que representan los menús
    JMenu menu1 = new JMenu("Archivo");
    menu1.setMnemonic('A');
    
    JMenu menu2 = new JMenu("Edición");
    menu2.setMnemonic('E');
    
    JMenu menu3 = new JMenu("Ayuda");
    menu3.setMnemonic('u');
    
    menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(menu3);
    
    //creación de los elementos (subcomandos) de cada categoría de menú
    JMenuItem item1 = new JMenuItem("Nuevo");
    item1.setMnemonic('N');
    
    JMenuItem item2 = new JMenuItem("Abrir");
    item2.setMnemonic('b');
    
    JMenuItem item3 = new JMenuItem("Guardar");
    item3.setMnemonic('G');
    
    JMenuItem item4 = new JMenuItem("Cortar", i1);
    item4.setMnemonic('C');
    
    JMenuItem item5 = new JMenuItem("Copiar", i2);
    item5.setMnemonic('o');
    
    JMenuItem item6 = new JMenuItem("Pegar", i3);
    item6.setMnemonic('P');
    
    JMenuItem item7 = new JMenuItem("Acerca de...");
    item7.setMnemonic('r');
    
    menu1.add(item1);
    menu1.addSeparator();
    menu1.add(item2);
    menu1.add(item3);
    
    menu2.add(item4);
    menu2.add(item5);
    menu2.add(item6);
    menu2.addSeparator();
    
    menu3.add(item7);
    
    //registrar auditores (escuchas u oyentes)
    item1.addActionListener(this);
    item2.addActionListener(this);
    item3.addActionListener(this);
    item4.addActionListener(this);
    item5.addActionListener(this);
    item6.addActionListener(this);
    item7.addActionListener(this);
  }//fin constructor de clase
  
  //método abstracto
  public void actionPerformed(ActionEvent w)
  {
    if(w.getActionCommand()=="Archivo")
      e.setText("menú abrir seleccionado");
    if(w.getActionCommand()=="Nuevo")
      e.setText("elemento nuevo seleccionado");
    if(w.getActionCommand()=="Abrir")
      e.setText("elemento abrir seleccionado");
    if(w.getActionCommand()=="Guardar")
      e.setText("elemento guardar seleccionado");
    
    if(w.getActionCommand()=="Edición")
      e.setText("menú edición seleccionado");
    if(w.getActionCommand()=="Copiar")
      e.setText("elemento copiar seleccionado");
    if(w.getActionCommand()=="Cortar")
      e.setText("elemento cortar seleccionado");
    if(w.getActionCommand()=="Pegar")
      e.setText("elemento pegar seleccionado");
    
    if(w.getActionCommand()=="Ayuda")
    {
     e.setText("menú ayuda seleccionado");
     JOptionPane.showMessageDialog(null, "Versión 1", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }
  }
} 