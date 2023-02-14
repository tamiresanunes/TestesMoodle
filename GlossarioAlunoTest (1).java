import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlossarioAlunoTest {

    @DisplayName("Adicionar um registro ou comentário ao Glossário")
    @Test
    public void adicionarRegistro() {
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar em adicionar registro
        navegador.findElement(By.xpath("//button[normalize-space()='Adicionar registro']")).click();
        //escrever
        navegador.findElement(By.xpath("//input[@name='concept']")).sendKeys("AALógica de Programação");
        //escrever a definição
        navegador.findElement(By.xpath("//div[@id='id_definition_editoreditable']")).sendKeys("É a técnica de encadear pensamentos para atingir determinado objetivo");
        //clicar em salvar mudanças
        navegador.findElement(By.xpath("//input[@id='id_submitbutton']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();


    }

    @DisplayName("Adicionar um comentário")
    @Test
    public void adicionarComentario(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar em adicionar um comentário
        //navegador.findElement(By.xpath("//span[normalize-space()='Comentários (0)']")).click();
        navegador.findElement(By.xpath("//tbody//div[2]//a[2]//span[1]")).click();
        //escrever o comentário
        //navegador.findElement(By.xpath("//textarea[@name='content']")).sendKeys("comentario de teste");
        navegador.findElement(By.xpath("//body[1]/div[2]/div[4]/div[1]/div[3]/div[1]/section[1]/div[2]/div[3]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[1]/div[2]/div[1]/textarea[1]")).sendKeys("Comentario de teste");
        //clicar em salvar
        navegador.findElement(By.xpath("//a[normalize-space()='Salvar comentário']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Excluir o comentário")
    @Test
    public void excluirComentário(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar no comentário
        navegador.findElement(By.xpath("//span[normalize-space()='Comentários (1)']")).click();
        //clicar em apagar o comentário
        navegador.findElement(By.xpath("//i[@title='Excluír o comentário publicado por TAMIRES ANTUNES NUNES em Ter, 6 Dez 2022, 18:53 PM']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Excluir registro ou tópico no Glossário")
    @Test
    public void excluirRegistro(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar em excluir o tópico
        navegador.findElement(By.xpath("//i[@title='Excluir item: AALógica de Programação']")).click();
        //clicar em confirmar a exclusão
        navegador.findElement(By.xpath("//button[normalize-space()='Continuar']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Mostrar todas os registros ou palavras chaves")
    @Test
    public void todasPalavrasChaves(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar em todos, para mostrar todas as ocorrências
        navegador.findElement(By.xpath("//b[normalize-space()='Todos']")).click();
        //navegador.findElement(By.xpath("//a[normalize-space()='Todos']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Pesquisar usando a ordem alfabética")
    @Test
    public void pesquisarOrdemAlfabetica(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clica na letra na qual deseja buscar, nesse caso letra C
        navegador.findElement(By.xpath("//a[normalize-space()='C']")).click();

        String resultado = navegador.findElement(By.xpath("//h4[normalize-space()='CC Lógica']")).getText();
        assertEquals("CC Lógica", resultado);

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Pesquisar por ordem alfabética porém não encontrando resultado com a letra correspondente")
    @Test
    public void pesquisaAlfabeticasemCorrespondente(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clica na letra na qual deseja buscar, nesse caso letra P
        navegador.findElement(By.xpath("//a[normalize-space()='P']")).click();

        String resultado = navegador.findElement(By.xpath("//div[normalize-space()='Nenhum item disponível nesta seção']")).getText();
        assertEquals("Nenhum item disponível nesta seção", resultado);

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Pesquisar pelo campo de pesquisa")
    @Test
    public void pesquisarCampoPesquisa(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar no campo e digitar
        navegador.findElement(By.xpath("//input[@placeholder='Buscar']")).sendKeys("DD Lógica");
        //clicar em pesquisar
        navegador.findElement(By.xpath("//div[@class='input-group-append']//button[@type='submit']")).click();

        String resultado = navegador.findElement(By.xpath("//h4[normalize-space()='DD Lógica']")).getText();
        assertEquals("DD Lógica", resultado);

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Pesquisar por caracteres especiais")
    @Test
    public void pesquisarCaracteresEspeciais(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //clicar em especiais
        navegador.findElement(By.xpath("//a[normalize-space()='Especial']")).click();

        String resultado = navegador.findElement(By.xpath("//h4[normalize-space()='505 Lógica']")).getText();
        assertEquals("505 Lógica", resultado);

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Acessar Glossário de Lógica da Programação")
    @Test
    public void acessarGlossarioLprogramacao(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de lógica da programação
        navegador.findElement(By.xpath("//li[8]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Acessar Glossário FAQ de Lógica da Programação")
    @Test
    public void acessarGlossarioFaq(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar no glossário FAQ de Lógica da Programação
        navegador.findElement(By.xpath("//li[56]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();
        //navegador.findElement(By.xpath("//div[contains(@data-activityname,'Palavras chaves sobre Logica de Programacao (FAQ)')]//a[contains(@class,'aalink stretched-link')]")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();


    }

    @DisplayName("Acessar Glossário de Pseudocódigo")
    @Test
    public void acessarGlossarioPseudocodigo(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de pseudocódigo
        navegador.findElement(By.xpath("//div[contains(@data-activityname,'Palavras chaves sobre Pseudocodigo')]//a[contains(@class,'aalink stretched-link')]")).click();


        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Acessar o Glossário de Algoritmos Não Estruturados")
    @Test
    public void acessarGlossarioAlgoritmoNaoEstruturado(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar no Glossário de Algoritmos Não Estruturados
        navegador.findElement(By.xpath("//div[contains(@data-activityname,'Palavras chaves sobre Algoritmos Nao Estruturados')]//a[contains(@class,'aalink stretched-link')]")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Acessar o Glossário de Algoritmos Estruturados")
    @Test
    public void acessarGlossarioAlgoritmoEstruturado(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador;
        navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de algoritmos estruturados
        navegador.findElement(By.xpath("//li[56]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//a[1]")).click();


        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Acessar Glossário de Algoritmos Estruturados Enciclopedia")
    @Test
    public void acessarGlossarioAlgoritmoEstruturadoEnciclopedia(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de algoritmos estruturados enciclopedia
        navegador.findElement(By.xpath("//div[contains(@data-activityname,'Palavras chaves sobre Algoritmos Estruturados (Enciclopedia)')]//a[contains(@class,'aalink stretched-link')]")).click();


        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Acessar Glossário de Algoritmos Estruturados Comentários")
    @Test
    public void acessarGlossarioAlgoritmoEstruturadoComentarios(){
        //Abrir o Chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        //abrir o site
        navegador.get("https://gmlunardi.pro.br/moodlerp2");
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
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
        //clicar em curso
        navegador.findElement(By.xpath("//a[normalize-space()='Curso']")).click();
        //clicar em glossário de algoritmos estruturados comentários
        navegador.findElement(By.xpath("//div[contains(@data-activityname,'Palavras chaves sobre Algoritmos Estruturados (COMENTARIOS)')]//a[contains(@class,'aalink stretched-link')]")).click();


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
