import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Classe para testar as funcionalidades das mensagens")
public class MensagensTest {

    @DisplayName("Adicionar alguém a lista de contatos")
    @Test
    public void adicionarContatos(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //clicar no ícone de mensagens
        navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        //clica em pesquisar
        navegador.findElement(By.xpath("//input[@data-region='view-overview-search-input']")).sendKeys("ANDRE LUIZ MENDES MIRANDA");
        //clica em pesquisar
        navegador.findElement(By.xpath("//span[@class='icon-no-margin btn btn-submit']")).click();
        String resultado = navegador.findElement(By.xpath("//a[@data-route='view-conversation']")).getText();
        assertEquals("ANDRE LUIZ MENDES MIRANDA", resultado);
        //clica no nome
        navegador.findElement(By.xpath("//a[@data-route='view-conversation']")).click();
        //clica em mais opções
        navegador.findElement(By.xpath("//i[@class='icon fa fa-ellipsis-h fa-fw ']")).click();
        //clica em adicionar aos contatos
        navegador.findElement(By.xpath("//a[normalize-space()='Adicionar aos contatos']")).click();
        //pede a confirmação
        navegador.findElement(By.xpath("//button[@data-action='confirm-add-contact']")).click();
        //navegador.findElement(By.xpath('//a[@data-route=\'view-conversation\']'))

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Enviar uma mensagem teste")
    @Test
    public void mensagensTeste(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //clicar no ícone de mensagens
        navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        //clica na minha conversa
        navegador.findElement(By.xpath("//strong[normalize-space()='TAMIRES ANTUNES NUNES']")).click();
        //clica e escrever no campo da mensagem
        navegador.findElement(By.xpath("//textarea[@placeholder='Escrever uma mensagem...']")).sendKeys("Mensagem teste para mim mesma");
        //clicar em enviar
        navegador.findElement(By.xpath("//span[@data-region='send-icon-container']")).click();


        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Criar um grupo")
    @Test
    public void criarumGrupo() {
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //criar grupo
        navegador.findElement(By.xpath("//input[@name='act_showcreateorphangroupform']")).click();
        //escreve o nome do grupo
        navegador.findElement(By.id("id_name")).sendKeys("Grupo de Algoritmo 5");
        //clica em mensagens de grupo, sim ou não
        navegador.findElement(By.xpath("//select[@name='enablemessaging']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@name='enablemessaging']")));
        se2.selectByValue("1");
        //clicar em salvar mudanças
        navegador.findElement(By.xpath("//input[@name='submitbutton']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Excluir um Grupo")
    @Test
    public void excluirumGrupo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //excluir o grupo
        //clica no grupo escolhido para ser excluido
        navegador.findElement(By.xpath("//option[@title='Grupo de Algoritmo 5 (0)']")).click();
        //clica em excluir grupo
        navegador.findElement(By.xpath("//input[@name='act_deletegroup']")).click();
        //clica na opção sim confirmando a exclusão
        navegador.findElement(By.xpath("//button[normalize-space()='Sim']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();


    }

    @DisplayName("Adicionar participante ao Grupo")
    @Test
    public void adicionarParticipante(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //clica no grupo escolhido
        navegador.findElement(By.xpath("//div[@data-region='mainpage']")).click();
        navegador.findElement(By.xpath("//option[@title='Grupo de Algoritmo 5 (0)']")).click();

        //Adicionar um novo participante ao grupo
        //Clicar em adicionar participante
        navegador.findElement(By.xpath("//input[@name='act_showaddmembersform']")).click();
        //clica no nome do participante desejado
        navegador.findElement(By.xpath("//option[@value='25']")).click();
        //clica em adicionar
        navegador.findElement(By.id("add")).click();
        //navegador.findElement(By.xpath("//input[@title='Adicionar']")).click();
        //clica em voltar para os cursos
        navegador.findElement(By.xpath("//input[@name='cancel']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Excluir participante do Grupo")
    @Test
    public void excluirParticipante(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //clica no grupo escolhido
        navegador.findElement(By.xpath("//div[@data-region='mainpage']")).click();
        navegador.findElement(By.xpath("//option[@title='Grupo de Algoritmo 5 (1)']")).click();

        // Excluir ou remover participante
        //clica em remover
        navegador.findElement(By.xpath("//input[@name='act_showaddmembersform']")).click();
        //clica no participante escolhido
        navegador.findElement(By.xpath("//option[@value='25']")).click();
        //clica em remover
        navegador.findElement(By.xpath("//input[@title='Remover']")).click();
        //clica em voltar para os cursos
        navegador.findElement(By.xpath("//input[@name='cancel']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Colocar imagem")
    @Test
    public void colocarImagem(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //Abre as configurações
        navegador.findElement(By.xpath("//div[@data-region='mainpage']")).click();
        //clica no grupo
        navegador.findElement(By.xpath("//option[@title='Grupo de Algoritmo 5 (1)']")).click();
        //clica na edição do grupo
        navegador.findElement(By.xpath("//input[@name='act_showgroupsettingsform']")).click();

        //Clica em adicionar imagem
        //navegador.findElement(By.xpath("//input[@name='imagefilechoose']")).click();
        //navegador.findElement(By.id("yui_3_17_2_1_1669301531420_1464")).click();
        //navegador.findElement(By.xpath("//div[@role='tab']//a[@class='nav-link active']")).click();
        //navegador.findElement(By.xpath("//input[@name='repo_upload_file']")).click();
        //carrega a imagem
        //navegador.findElement(By.xpath("//input[@name='repo_upload_file']")).sendKeys("C:\\Users\\Tamires Nunes\\Downloads");
        //clica em enviar o arquivo
        //.findElement(By.xpath("//button[normalize-space()='Enviar este arquivo']")).click();
        //clica em salvar mudanças
        //navegador.findElement(By.xpath("//input[@name='submitbutton']")).click();
    }

    @DisplayName("Alterar o nome do grupo")
    @Test
    public void alterarnomeGrupo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //Abre as configurações
        navegador.findElement(By.xpath("//div[@data-region='mainpage']")).click();
        //clica no grupo
        navegador.findElement(By.xpath("//option[@title='Grupo de Algoritmo 5 (1)']")).click();
        //clica na edição do grupo
        navegador.findElement(By.xpath("//input[@name='act_showgroupsettingsform']")).click();

        // alterar o nome do Grupo
        // clica em editar test titulo
        navegador.findElement(By.xpath("//input[@name='name']")).click();
        //escrever o novo nome ou titulo do grupo
        navegador.findElement(By.xpath("//input[@name='name']")).sendKeys("Renomeado (1) ");
        //clica em salvar mudanças
        navegador.findElement(By.xpath("//input[@name='submitbutton']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();


    }

    @DisplayName("Senha do Grupo")
    @Test
    public void senhadoGrupo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Clica no menu
        navegador.findElement(By.xpath("//a[@id='user-menu-toggle']")).click();
        //Clica no perfil
        navegador.findElement(By.xpath("//a[normalize-space()='Perfil']")).click();
        //clica no meu curso
        navegador.findElement(By.xpath("//a[normalize-space()='ALGORITMOS GRUPO 5']")).click();
        //clica em participantes
        navegador.findElement(By.xpath("//a[normalize-space()='Participantes']")).click();
        //clica em usuários inscritos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        //clica na opção Grupos
        navegador.findElement(By.xpath("//select[@name='jump']")).click();
        Select se1 = new Select(navegador.findElement(By.xpath("//select[@name='jump']")));
        se1.selectByValue("/group/index.php?id=7");

        //Criar o grupo com senha dessa vez
        //clica em criar grupo
        navegador.findElement(By.xpath("//input[@name='act_showcreateorphangroupform']")).click();
        //Coloca o nome do grupo
        navegador.findElement(By.xpath("//input[@name='name']")).sendKeys("Grupo de Algoritmo com Senha ");
        //clica em código de inscrição, o que seria o lugar da senha
        navegador.findElement(By.xpath("//select[@name='enablemessaging']")).click();
        //Colocar a senha
        navegador.findElement(By.xpath("//a[@data-passwordunmask='edit']")).sendKeys("Senha2210100505");
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@name='enablemessaging']")));
        se2.selectByValue("0");
        //Salvar alterações
        navegador.findElement(By.xpath("//input[@name='submitbutton']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();



    }

    @DisplayName("Adicionar o grupo ao favoritos ou favoritar o grupo")
    @Test
    public void favoritarGrupo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        ChromeDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        navegador.findElement(By.xpath("/@data-egion='content-container']//a[@role='button']/div[")).click();
        navegador.findElement(By.xpath("//i[@class='icon fa fa-ellipsis-h fa-fw ']")).click();
        navegador.findElement(By.xpath("//a[normalize-space()='Favoritar conversa']")).click();


        //Adicionar o grupo aos favoritos
        //clica nas mensagens
        //navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        //navegador.findElement(By.xpath("//body//div[@id='page-wrapper']//div[@data-region='content-container']//div//div//div//span[1]//i[1]")).click();
        //clica no grupo nas mensagens
        //navegador.findElement(By.xpath("//strong[normalize-space()='Grupo de Algoritmo 5Renomeado (1)']")).click();
        //navegador.findElement(By.xpath("//div[@data-region='view-overview-group-messages']//a[@role='button']")).click();
        //clica no mais opções dentro da conversa do grupo
        //navegador.findElement(By.xpath("//button[@id='conversation-actions-menu-button']")).click();
        //clica em favoritar conversa
        //navegador.findElement(By.xpath("//a[normalize-space()='Favoritar conversa']")).click();
        //clica em voltar para a visão geral das conversas
        //navegador.findElement(By.xpath("//a[@aria-label='Voltar para Visão geral das mensagens']//div[1]//span[1]")).click();
        //clica em voltar para a visão geral das conversas
        //navegador.findElement(By.xpath("//a[@aria-label='Voltar para Visão geral das mensagens']")).click();
        //clica nos favoritos
        //navegador.findElement(By.xpath("//span[normalize-space()='Favoritos']")).click();

        //Verificar se foi para os favoritos
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       // navegador.findElement(By.xpath("//div[@data-region='content-container']//a[@role='button']//div//div//strong[contains(text(),'Grupo de Algoritmo 5Renomeado (1)')]")).click();
        //String favoritos = navegador.findElement(By.xpath("//a[@data-action='view-group-info']//div//div//strong[contains(text(),'Grupo de Algoritmo 5Renomeado (1)')]")).getText();
        //assertEquals("Grupo de Algoritmo 5Renomeado (1)", favoritos);

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Desfavoritar ou retirar o grupo dos favoritos")
    @Test
    public void desfavoritarGrupo(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //remover dos favoritos
        //clicar nas mensagens
        navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        //clicar no grupo
        navegador.findElement(By.xpath("//span[@class='dir-rtl-hide']//i[@class='icon fa fa-chevron-right fa-fw ']")).click();
        //clicar em mais opções
        navegador.findElement(By.xpath("//i[@class='icon fa fa-ellipsis-h fa-fw ']")).click();
        //clicar em remover dos favoritos
        navegador.findElement(By.xpath("//a[normalize-space()='Remover estrela da conversa']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//div[@class='d-flex flex-column']//div[@class='align-self-stretch']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Colocar grupo no Mudo")
    @Test
    public void mudoGrupo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        ChromeDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        //navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clicar em acessar
        navegador.findElement(By.xpath("//div[@data-region='usermenu']//div//a[contains(text(),'Acessar')]")).click();
        //clicar em usuário e colocar o nome
        navegador.findElement(By.id("username")).sendKeys("2210100505");
        //clicar na senha e a colocar
        navegador.findElement(By.id("password")).sendKeys("2210100505");
        //clicar em acessar
        navegador.findElement(By.id("loginbtn")).click();

        //Colocar grupo no mudo
        //clicar nas mensagens
        navegador.findElement(By.xpath("//i[@title='Alternar menu de mensagens']")).click();
        //clicar no grupo
        navegador.findElement(By.xpath("//span[@class='dir-rtl-hide']//i[@class='icon fa fa-chevron-right fa-fw ']")).click();
        //clicar em mais opções
        navegador.findElement(By.xpath("//i[@class='icon fa fa-ellipsis-h fa-fw ']")).click();
        //clicar em mudo
        navegador.findElement(By.xpath("//a[normalize-space()='Mudo']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//div[@class='d-flex flex-column']//div[@class='align-self-stretch']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }


}
