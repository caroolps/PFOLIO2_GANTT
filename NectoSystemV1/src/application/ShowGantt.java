package application;
import java.util.List;
import application.GraphGantt;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import application.GraphGantt;
import model.dao.impl.*;
import db.DB;
import model.entities.Projetos;

public class ShowGantt {

	
		public void mostrarGrafico() {
		ProjetosDaoJDBC acess = new ProjetosDaoJDBC(DB.getConnection()); //conecta o banco
		List<Projetos> tarefas = acess.findAll(); //lista os dados da tabela
		GraphGantt gantt = new GraphGantt("NECTO",tarefas);	
	}

}
