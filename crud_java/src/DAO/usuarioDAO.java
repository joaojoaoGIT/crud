package DAO;

import java.sql.*;
import DTO.usuarioDTO;
import javax.swing.JOptionPane;

public class usuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(usuarioDTO objusuarioDTO) {

        conn = new conexaoDAO().conectaBD();

        try {
            String sql = "select * from usuario where nome_usuario = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuarioDTO.getNome_usuario());
            pstm.setString(2, objusuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " UsuarioDAO" + erro);
        }
        return null;

    }

}
    