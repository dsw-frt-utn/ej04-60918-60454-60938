package views;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPrincipalView extends JFrame {

    private JButton btnListarVehiculos;
    private JButton btnAgregarVehiculo;

    public MenuPrincipalView() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menú Principal");
        setSize(420, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel lblTitulo = new JLabel("Sistema de Vehículos");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));

        btnListarVehiculos = new JButton("Listar Vehículos");
        btnAgregarVehiculo = new JButton("Agregar Vehículo");

        btnListarVehiculos.addActionListener(e -> {
            ListarVehiculosView view = new ListarVehiculosView();
            view.setVisible(true);
        });

        btnAgregarVehiculo.addActionListener(e -> {
            AgregarVehiculo view = new AgregarVehiculo();
            view.setVisible(true);
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(lblTitulo, gbc);

        gbc.gridy = 1;
        panel.add(btnListarVehiculos, gbc);

        gbc.gridy = 2;
        panel.add(btnAgregarVehiculo, gbc);

        add(panel);
    }
}