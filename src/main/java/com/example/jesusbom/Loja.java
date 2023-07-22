package com.example.jesusbom;

import javafx.application.Application;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.*;
import java.util.List;


public class Loja extends Application {

    private DataDAO dataDao = new DataDAO();
    public void TabelasRelacionadasApp() {
        dataDao = new DataDAO();
    }
    @Override
    public void start(Stage stage)  {

        stage.initStyle(StageStyle.TRANSPARENT);
        ImageView ic = new ImageView(ImageLoader.loadImage("loja.png"));
        ImageView img1 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView ic3 = new ImageView(ImageLoader.loadImage("bg7.png"));
        ImageView img7 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img2 = new ImageView(ImageLoader.loadImage("bt.png"));
        TextField fly= new TextField ();
        PasswordField fly1= new PasswordField ();
        PasswordField fly10= new PasswordField ();

        fly.setMinWidth(100);
        fly.setPrefWidth(50);
        fly.setMaxWidth(200);
        fly.setMinHeight(30);
        fly.setPrefHeight(50);
        fly.setMaxHeight(30);
        fly.setTranslateX(10);
        fly.setTranslateY(95);
        fly10.setMinWidth(100);
        fly10.setPrefWidth(50);
        fly10.setMaxWidth(200);
        fly10.setMinHeight(30);
        fly10.setPrefHeight(50);
        fly10.setMaxHeight(30);
        fly10.setTranslateX(50);
        fly10.setTranslateY(90);
        fly10.setMinWidth(100);
        fly10.setPrefWidth(50);
        fly10.setMaxWidth(200);
        fly10.setMinHeight(30);
        fly10.setPrefHeight(50);
        fly10.setMaxHeight(30);
        fly10.setTranslateX(50);
        fly10.setTranslateY(90);
        fly1.setMinWidth(100);
        fly1.setPrefWidth(50);
        fly1.setMaxWidth(200);
        fly1.setMinHeight(30);
        fly1.setPrefHeight(50);
        fly1.setMaxHeight(30);
        fly1.setTranslateX(50);
        fly1.setTranslateY(90);
        fly1.setMinWidth(100);
        fly1.setPrefWidth(50);
        fly1.setMaxWidth(200);
        fly1.setMinHeight(30);
        fly1.setPrefHeight(50);
        fly1.setMaxHeight(30);
        fly1.setTranslateX(50);
        fly1.setTranslateY(90);
        PasswordField fly2= new PasswordField ();
        TextField fly3= new TextField ();
        Label labelNome = new Label("Nome do Produto:");
        TextField textFieldNome = new TextField();

        Label labelValor = new Label("Valor do Produto:");
        TextField textFieldValor = new TextField();

        Label labelLogin = new Label("Login:");
        TextField textFieldLogin = new TextField();

        Label labelLogin2 = new Label("Login:");
        TextField textFieldLogin2 = new TextField();

        Label labelNome2 = new Label("Nome do Produto:");
        TextField textFieldNome2 = new TextField();





        fly2.setMinWidth(100);
        fly2.setPrefWidth(50);
        fly2.setMaxWidth(200);
        fly2.setMinHeight(30);
        fly2.setPrefHeight(50);
        fly2.setMaxHeight(30);
        fly2.setTranslateX(5);
        fly2.setTranslateY(180);
        PasswordField fly5= new PasswordField ();

        fly5.setMinWidth(100);
        fly5.setPrefWidth(50);
        fly5.setMaxWidth(200);
        fly5.setMinHeight(30);
        fly5.setPrefHeight(50);
        fly5.setMaxHeight(30);
        fly5.setTranslateX(10);
        fly5.setTranslateY(170);
        fly3.setMinWidth(100);
        fly3.setPrefWidth(50);
        fly3.setMaxWidth(200);
        fly3.setMinHeight(30);
        fly3.setPrefHeight(50);
        fly3.setMaxHeight(30);
        fly3.setTranslateX(10);
        fly3.setTranslateY(80);
        labelNome.setMinWidth(200);
        labelNome.setTranslateY(48);
        labelNome.setTranslateX(-110);
        textFieldNome.setMinWidth(200);
        textFieldNome.setTranslateY(50);
        textFieldNome.setTranslateX(0);
        textFieldNome.setMaxWidth(200);
        labelValor.setMinWidth(60);
        labelValor.setTranslateY(96);
        labelValor.setTranslateX(-160);
        textFieldValor.setTranslateX(0);
        textFieldValor.setTranslateY(100);
        textFieldValor.setMinWidth(200);
        textFieldValor.setMaxWidth(200);
        labelLogin.setMinWidth(60);
        labelLogin.setTranslateY(150);
        labelLogin.setTranslateX(-120);
        textFieldLogin.setTranslateY(150);
        textFieldLogin.setTranslateX(0);
        textFieldLogin.setMaxWidth(200);
        textFieldLogin.setMinWidth(200);
        labelLogin2.setMinWidth(60);
        labelLogin2.setTranslateY(150);
        labelLogin2.setTranslateX(-120);
        textFieldLogin2.setTranslateY(150);
        textFieldLogin2.setTranslateX(0);
        textFieldLogin2.setMaxWidth(200);
        textFieldLogin2.setMinWidth(200);
        labelNome2.setMinWidth(200);
        labelNome2.setTranslateY(48);
        labelNome2.setTranslateX(-140);
        textFieldNome2.setMinWidth(200);
        textFieldNome2.setTranslateY(50);
        textFieldNome2.setTranslateX(0);
        textFieldNome2.setMaxWidth(200);

        ImageView buttonRegistrar = new ImageView(ImageLoader.loadImage("bt7.png"));

        buttonRegistrar.setTranslateY(200);
        buttonRegistrar.setTranslateX(0);

        buttonRegistrar.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            String nomeProduto = textFieldNome.getText();
            double valorProduto = Double.parseDouble(textFieldValor.getText());
            String login = textFieldLogin.getText();

            if (nomeProduto.isEmpty() || login.isEmpty()) {
                exibirAlertaErro("Preencha todos os campos obrigatórios.");
            } else {
                registrarProduto(nomeProduto, (int) valorProduto, login);
                exibirAlertaInfo();
            }
        });
        ImageView ic2 = new ImageView(ImageLoader.loadImage("bg2.png"));
        ImageView img3 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img4 = new ImageView(ImageLoader.loadImage("bt2.png"));
        ImageView img6 = new ImageView(ImageLoader.loadImage("bt7.png"));
        ImageView img5 = new ImageView(ImageLoader.loadImage("bt5.png"));
        ImageView img9 = new ImageView(ImageLoader.loadImage("bg4.png"));
        ImageView img8 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img10 = new ImageView(ImageLoader.loadImage("bt8.png"));
        ImageView img11 = new ImageView(ImageLoader.loadImage("bg10.png"));
        ImageView img12 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img13 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img14 = new ImageView(ImageLoader.loadImage("bg10.png"));
        ImageView img15 = new ImageView(ImageLoader.loadImage("bg7.png"));
        ImageView img16 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img17 = new ImageView(ImageLoader.loadImage("bt7.png"));
        ImageView img18 = new ImageView(ImageLoader.loadImage("cs.png"));
        ImageView img19 = new ImageView(ImageLoader.loadImage("bg10.png"));
        ImageView img20 = new ImageView(ImageLoader.loadImage("bt8.png"));

        Button ic5 = new Button("Test");
        img20.setTranslateX(5);
        img20.setTranslateY(220);
        img10.setTranslateX(5);
        img10.setTranslateY(220);
        img6.setTranslateX(200);
        img6.setTranslateY(0);
        img17.setTranslateX(200);
        img17.setTranslateY(0);
        img5.setTranslateX(190);
        img5.setTranslateY(180);
        VBox icaro = new VBox();
        VBox icaro2 = new VBox();
        VBox icaro3 = new VBox();
        VBox icaro4 = new VBox();
        VBox icaro5 = new VBox();
        VBox icaro6 = new VBox();
        VBox icaro7 = new VBox();
        VBox icaro8 = new VBox();
        StackPane stackPane = new StackPane();
        StackPane stackPane2 = new StackPane();
        StackPane stackPane3 = new StackPane();
        StackPane stackPane4 = new StackPane();
        StackPane stackPane5 = new StackPane();
        StackPane stackPane6 = new StackPane();
        StackPane stackPane7 = new StackPane();
        StackPane stackPane8 = new StackPane();


        TableView<Produto> tabelaProdutos = new TableView<>();
        TableColumn<Produto, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        TableColumn<Produto, Double> valorColumn = new TableColumn<>("Valor");
        valorColumn.setCellValueFactory(new PropertyValueFactory<>("valor"));


        // Configurar a tabela de produtos
        tabelaProdutos.getColumns().addAll(nomeColumn, valorColumn);
        Scene scene2 = new Scene(icaro2,600,500);
        Scene scene3 = new Scene(icaro3,600,500);
        Scene scene4 = new Scene(icaro4,600,500);
        Scene scene5 = new Scene(icaro5,600,500);
        Scene scene6 = new Scene(icaro6,600,500);
        Scene scene7 = new Scene(icaro7,600,500);
        Scene scene8 = new Scene(icaro8,600,500);
        icaro8.getChildren().addAll(stackPane8);
        icaro7.getChildren().addAll(stackPane7);
        icaro6.getChildren().addAll(stackPane6);
        icaro5.getChildren().addAll(stackPane5);
        icaro4.getChildren().addAll(stackPane4);
        icaro3.getChildren().addAll(stackPane3);
        icaro2.getChildren().addAll(stackPane2); Button button1 = new Button("Ir para o login");
        button1.setOnAction(event -> stage.setScene(scene2));

        Label flytext = new Label();
        flytext.setText("Bem vindo a loja 'Jesus é fiel' essa é a versão 1.0 do software ");
        Label flytext2 = new Label();
        flytext2.setText("Bem vindo a loja 'Jesus é fiel' essa é a versão 1.0 do software, digite todos os campos certos ");
        Button bt3 = new Button("Login como adm");
        bt3.setTranslateX(0);
        bt3.setTranslateY(50);

        bt3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {



            if (fly.getText().equals("lord") && fly2.getText().equals("jesus")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Adm paniel");
                alert.setHeaderText("Clique em OK para prosseguir");
                ImageView iconView = new ImageView(ImageLoader.loadImage("icon1.png"));
                alert.getDialogPane().setGraphic(iconView);
                alert.setContentText("Você logou como adm");
                alert.initOwner(scene2.getRoot().getScene().getWindow());
                alert.setOnHidden(handler -> {
                    fly.setText("");
                    fly2.setText("");
                    textFieldValor.setText("");
                    textFieldLogin.setText("");
                    textFieldNome.setText("");
                    stage.setScene(scene5);
                });


                alert.showAndWait();
            } else {
                Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
                alert2.setTitle("Login inválido");
                alert2.setHeaderText("Login inválido");
                alert2.setContentText("Você digitou a senha ou login inválido não será capaz de proseguir");
                ImageView iconView2 = new ImageView(ImageLoader.loadImage("icon2.png"));
                alert2.getDialogPane().setGraphic(iconView2);

                alert2.initOwner(scene2.getRoot().getScene().getWindow());
                alert2.showAndWait();
            }
        });

        img4.addEventHandler(MouseEvent.MOUSE_CLICKED, event ->{
            String login = fly.getText();
            String senha = fly2.getText();
            if (verificarLogin(login, senha)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Login bem-sucedido!");
                alert.setHeaderText(null);
                alert.setContentText("Bem-vindo, " + login + "!");
                alert.initOwner(scene2.getRoot().getScene().getWindow());
                Image iconImage = ImageLoader.loadImage("icon3.png");

                stage.getIcons().add(iconImage);

                ImageView iconView4 = new ImageView(ImageLoader.loadImage("icon6.png"));
                alert.getDialogPane().setGraphic(iconView4);
                List<Produto> produtos = dataDao.getProdutosPorLogin(login);

                tabelaProdutos.getItems().setAll(produtos);

                alert.setOnHidden(handler -> stage.setScene(scene6));
                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Login falhou!");
                alert.setHeaderText(null);
                alert.setContentText("Usuário ou senha incorretos.");
                alert.initOwner(scene2.getRoot().getScene().getWindow());
                Image iconImage = ImageLoader.loadImage("icon3.png");

                stage.getIcons().add(iconImage);
                ImageView iconView4 = new ImageView(ImageLoader.loadImage("icon5.png"));
                alert.getDialogPane().setGraphic(iconView4);
                alert.showAndWait();
            }
            fly.clear();
            fly2.clear();
        });
        stackPane2.getChildren().addAll(ic2,img3,img4,fly,fly2,img5,bt3);
        stackPane3.getChildren().addAll(ic3,img7,img6,fly1);
        stackPane4.getChildren().addAll(img9,img8,img10,fly5,fly3,button1);
        stackPane5.getChildren().addAll(img11,img12,flytext,labelNome,textFieldNome,labelValor,textFieldValor,labelLogin,textFieldLogin, buttonRegistrar);
        stackPane6.getChildren().addAll(ic5,img14,tabelaProdutos,img13);
        stackPane7.getChildren().addAll(img15,img16,fly10,img17);
        stackPane8.getChildren().addAll(img19,img18,labelNome2,textFieldNome2 , flytext2,img20,labelLogin2,textFieldLogin2);
        stackPane.getChildren().addAll(ic, img2, img1);
        tabelaProdutos.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Produto produtoSelecionado = tabelaProdutos.getSelectionModel().getSelectedItem();

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Clique em OK para prosseguir");
                ImageView iconView = new ImageView(ImageLoader.loadImage("icon1.png"));
                alert.getDialogPane().setGraphic(iconView);
                alert.setTitle("Detalhes do Produto");
                alert.setHeaderText("Produto selecionado: " + produtoSelecionado.getNome()+" Chame seu chefe para confirmar a venda");
                alert.setContentText("Valor: " + produtoSelecionado.getValor());
                alert.initOwner(scene3.getRoot().getScene().getWindow());
                alert.showAndWait();
                fly1.setText("");
                stage.setScene(scene7);
            }
        });


        // Preencha a tabela com os produtos do login específico (substitua "login_desejado" pelo login que deseja buscar)

        img2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> stage.setScene(scene2));

        img5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> stage.setScene(scene3));
        img13.setTranslateX(250);
        img13.setTranslateY(-212);
        img12.setTranslateX(250);
        img12.setTranslateY(-212);
        img1.setTranslateX(250);
        img18.setTranslateY(-212);
        img18.setTranslateX(250);
        img1.setTranslateY(-212);
        img3.setTranslateX(250);
        img3.setTranslateY(-212);
        img7.setTranslateX(250);
        img7.setTranslateY(-212);
        button1.setTranslateY(35);
        ImageView ic33 = new ImageView(ImageLoader.loadImage("icon3.png"));


        img6.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {



            if (fly1.getText().equals("angelfly")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Parabéns chave correta");
                alert.setHeaderText("Clique em OK para prosseguir");
                ImageView iconView = new ImageView(ImageLoader.loadImage("icon1.png"));
                alert.getDialogPane().setGraphic(iconView);
                alert.setContentText("Após o OK, você irá informar seu login e senha para cadastro");
                alert.initOwner(scene3.getRoot().getScene().getWindow());
                alert.setOnHidden(handler -> {
                    fly1.setText("");
                    stage.setScene(scene4);
                });


                alert.showAndWait();
            } else {
                Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
                alert2.setTitle("Erro");
                alert2.setHeaderText("Chave inválida");
                alert2.setContentText("Você digitou a chave inválida não será capaz de proseguir");
                ImageView iconView2 = new ImageView(ImageLoader.loadImage("icon2.png"));
                alert2.getDialogPane().setGraphic(iconView2);

                alert2.initOwner(scene3.getRoot().getScene().getWindow());
                alert2.showAndWait();
            }
        });
        img17.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {



            if (fly10.getText().equals("angelfly")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Parabéns chave correta");
                alert.setHeaderText("Clique em OK para prosseguir");
                ImageView iconView = new ImageView(ImageLoader.loadImage("icon1.png"));
                alert.getDialogPane().setGraphic(iconView);
                alert.setContentText("Após o OK, você pode registrar a venda");
                alert.initOwner(scene3.getRoot().getScene().getWindow());
                alert.setOnHidden(handler -> {
                    fly10.setText("");
                    stage.setScene(scene8);
                });


                alert.showAndWait();
            } else {
                Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
                alert2.setTitle("Erro");
                alert2.setHeaderText("Chave inválida");
                alert2.setContentText("Você digitou a chave inválida não será capaz de proseguir");
                ImageView iconView2 = new ImageView(ImageLoader.loadImage("icon2.png"));
                alert2.getDialogPane().setGraphic(iconView2);

                alert2.initOwner(scene3.getRoot().getScene().getWindow());
                alert2.showAndWait();
            }
        });
        img2.setTranslateX(130);
        img2.setTranslateY(0);
        img13.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img18.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));

        img7.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img3.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img8.setTranslateX(250);
        img8.setTranslateY(-212);
        img16.setTranslateX(250);
        img16.setTranslateY(-212);
        img8.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img12.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img16.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> System.exit(0));
        img10.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            String login = fly3.getText();
            String senha = fly5.getText();
            stage.getIcons().add(ic33.getImage());

            registrarCadastro(login, senha);
        });

        img20.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {

            String nomeProduto = textFieldLogin2.getText();
            String nomelogin = textFieldNome2.getText();
            boolean exclusaoBemSucedida = deleteProdutoPorNome(nomeProduto,nomelogin);

            if (exclusaoBemSucedida) {
                mostrarAlerta("Produto Deletado", "Produto '" + nomeProduto + "' foi deletado com sucesso.",
                        Alert.AlertType.INFORMATION);
            } else {
                mostrarAlerta("Erro", "Produto não encontrado ou exclusão falhou.", Alert.AlertType.ERROR);
            }


        });
        Scene scene = new Scene(icaro, 600, 500);
        icaro.getChildren().addAll(stackPane);
        scene.getStylesheets().add("good.css");
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        scene2.setFill(Color.TRANSPARENT);
        scene3.setFill(Color.TRANSPARENT);
        scene4.setFill(Color.TRANSPARENT);
        scene5.setFill(Color.TRANSPARENT);
        scene6.setFill(Color.TRANSPARENT);
        scene7.setFill(Color.TRANSPARENT);
        scene8.setFill(Color.TRANSPARENT);



        icaro2.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro3.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro4.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro5.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro6.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro7.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        icaro8.setBackground(new Background(new BackgroundFill(Color.TRANSPARENT, CornerRadii.EMPTY, Insets.EMPTY)));
        Image iconeImage = ImageLoader.loadImage("icon3.png");

        // Cria um ImageView para exibir a imagem, se necessário
        ImageView iconeView = new ImageView(iconeImage);
        stage.getIcons().add(iconeImage);
        stage.setScene(scene);

        stage.show();


    }
    String url = "jdbc:sqlite:BD_icaro.db";

    private void registrarCadastro(String login, String senha) {
        // Configuração da conexão com o banco de dados SQLite
        try (Connection conn = DriverManager.getConnection(url)) {
            // Comando SQL para inserir os dados na tabela de cadastros
            String sql = "INSERT INTO cadastros (login, senha) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);

            pstmt.executeUpdate();
            Alert alert3 = new Alert(Alert.AlertType.INFORMATION);
            alert3.setTitle("Cadastro");
            alert3.setHeaderText(null);
            alert3.setContentText("Cadastro realizado com sucesso!");
            Stage stage = (Stage) alert3.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new javafx.scene.image.Image("img/icon3.png"));
            ImageView iconView4 = new ImageView("img/icon6.png");
            alert3.getDialogPane().setGraphic(iconView4);
            alert3.showAndWait();

        } catch (SQLException e) {
            Alert alert4 = new Alert(Alert.AlertType.INFORMATION);
            alert4.setTitle("Cadastro");
            alert4.setHeaderText(null);
            alert4.setContentText("Erro ao realizar cadastro!");
            Stage stage = (Stage) alert4.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new javafx.scene.image.Image("img/icon3.png"));
            ImageView iconView5 = new ImageView("img/icon5.png");
            alert4.getDialogPane().setGraphic(iconView5);
            alert4.showAndWait();        }
    }
    private boolean verificarLogin(String login, String senha) {
        try (Connection conn = DriverManager.getConnection(url)) {
            String query = "SELECT * FROM cadastros WHERE login = ? AND senha = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, login);
            pstmt.setString(2, senha);
            ResultSet resultSet = pstmt.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Erro ao verificar login: " + e.getMessage());
        }

        return false;
    }

    private void registrarProduto(String nomeProduto, int valorProduto, String login) {
        try {
            // Conectar-se ao banco de dados
            Connection conn = DriverManager.getConnection(url);

            // Inserir o produto na tabela Produtos
            PreparedStatement insertProduto = conn.prepareStatement(
                    "INSERT INTO Produtos (nome, valor, login) VALUES (?, ?, ?)"
            );
            insertProduto.setString(1, nomeProduto);
            insertProduto.setInt(2, valorProduto);
            insertProduto.setString(3, login);
            insertProduto.executeUpdate();

            // Fechar a conexão
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            exibirAlertaErro("Erro ao registrar o produto: " + e.getMessage());
        }
    }

    private void exibirAlertaErro(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void exibirAlertaInfo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText(null);
        alert.setContentText("Produto registrado com sucesso!");
        alert.showAndWait();
    }


    // Função para deletar o produto da tabela produtos no SQLite
    private boolean deleteProdutoPorNome(String nomeProduto, String nomelogin) {
        String query = "UPDATE produtos SET nome = NULL WHERE login = ? AND nome = ?";

        try (Connection connection = Dao.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, nomeProduto);
            preparedStatement.setString(2, nomelogin);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; // Retorna true se a exclusão foi bem-sucedida
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // Retorna false se a exclusão falhar
    }

    // Função auxiliar para mostrar um Alerta
    private void mostrarAlerta(String titulo, String conteudo, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(conteudo);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}