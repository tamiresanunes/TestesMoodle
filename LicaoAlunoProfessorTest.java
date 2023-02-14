import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

@DisplayName("Teste para Lição pela visão do aluno e do professor")
public class LicaoAlunoProfessorTest {

    @DisplayName("Criar Lição em Lógica da Programação")
    @Test
    public void criarLicaoLprogramacao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em criar atividade ou recurso
        //navegador.findElement(By.xpath("//body[1]/div[5]/div[5]/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[2]/button[1]/span[1]/i[1]")).click();
        navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[2]")).click();
        //Select se1 = new Select(navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[2]")));
        //se1.selectByValue("1");
        navegador.findElement(By.xpath("//div[@class='tab-pane active ']//a[@title='Adicionar um novo Lição']")).click();
        //CLICAR NO NOME E DIGITAR
        navegador.findElement(By.xpath("//input[@id='id_name']")).sendKeys("Lição teste 1");
        //salva e mostra
        //navegador.findElement(By.xpath("//input[@id='id_submitbutton']")).click();
        //salva e volta ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Criar Lição em Pseudocódigo")
    @Test
    public void criarLicaoPseudocodigo(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em criar atividade ou recurso
        navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[3]")).click();
        //clicar em criar lição
        navegador.findElement(By.xpath("//div[@class='tab-pane active ']//a[@title='Adicionar um novo Lição']")).click();
        //navegador.findElement(By.xpath("//body[1]/div[9]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[11]/div[1]")).click();
        //clicar no nome do teste e escrevê-lo
        navegador.findElement(By.xpath("//input[@id='id_name']")).sendKeys("Lição Teste de Pseudocódigo");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Criar Lição em Algoritmos Não Estruturados")
    @Test
    public void criarLicaoAlgoritmosNaoEstruturados(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em nova atividade ou tarefa
        navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[4]")).click();
        //clicar em lição
        navegador.findElement(By.xpath("//div[@class='tab-pane active ']//a[@title='Adicionar um novo Lição']")).click();
        //clicar no nome e digitar
        navegador.findElement(By.xpath("//input[@id='id_name']")).sendKeys("Lição Teste de Algoritmos Não Estruturados");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Criar Lição de Algoritmos Estruturados")
    @Test
    public void criarLicaoAlgoritmosEstruturados(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em nova atividade ou tarefa
        navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[5]")).click();
        //clicar em lição
        navegador.findElement(By.xpath("//div[@class='tab-pane active ']//a[@title='Adicionar um novo Lição']")).click();
        //clicar no nome e digitar
        navegador.findElement(By.xpath("//input[@id='id_name']")).sendKeys("Lição Teste de Algoritmos Estruturados");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Excluir Lição")
    @Test
    public void excluirLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos presente na lição
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em excluir
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//span[@class='menu-action-text'][normalize-space()='Excluir']")).click();
        //clicar em sim
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


    @DisplayName("Mover Lição de Lugar")
    @Test
    public void moverLicaodeLugar(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste para Mover']//i[@title='Editar']")).click();
        //clicar em mover
        navegador.findElement(By.xpath("//div[contains(@class,'dropdown-menu menu dropdown-menu-right show')]//i[contains(@class,'icon fa fa-arrows fa-fw')]")).click();
        //clicar no local escolhido para mover a Lição
        navegador.findElement(By.xpath("//div[contains(@class,'modal moodle-has-zindex show')]//a[contains(@class,'collapse-list-link text-truncate')][normalize-space()='PSEUDOCÓDIGO']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Ocultar Lição para os Estudantes")
    @Test
    public void ocultarLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em ocultar
        navegador.findElement(By.xpath("//div[contains(@class,'dropdown-menu menu dropdown-menu-right show')]//i[contains(@class,'icon fa fa-eye fa-fw')]")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Desocultar a Lição")
    @Test
    public void desocultarLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em desocultar
        navegador.findElement(By.xpath("//i[@class='icon fa fa-eye-slash fa-fw ']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Duplicar Lição")
    @Test
    public void duplicarLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em duplicar
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-copy fa-fw')]")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Atribuir Papel de Moderador a Lição")
    @Test
    public void papelModerador(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em Atribuir Papel
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-user-circle fa-fw')]")).click();
        //clicar no papel de Moderador
        navegador.findElement(By.xpath("//a[normalize-space()='Moderador']")).click();
        //clicar na pessoa escolhida para ser adicionada
        navegador.findElement(By.xpath("//option[@value='25']")).click();
        //clica em adicionar
        navegador.findElement(By.xpath("//input[@id='add']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Atribuir Papel de Estudante a Lição")
    @Test
    public void papelEstudante(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em Atribuir Papel
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-user-circle fa-fw')]")).click();
        //clicar no papel do Estudante
        navegador.findElement(By.xpath("//a[normalize-space()='Estudante']")).click();
        //clicar no estudante escolhido
        navegador.findElement(By.xpath("//option[@value='32']")).click();
        //clicar em adicionar
        navegador.findElement(By.xpath("//input[@id='add']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();



    }

    @DisplayName("Excluir Moderador da Lição")
    @Test
    public void excluirModerador(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em Atribuir Papel
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-user-circle fa-fw')]")).click();
        //clicar no papel de Moderador
        navegador.findElement(By.xpath("//a[normalize-space()='Moderador']")).click();
        //clicar na pessoa escolhida para ser excluida
        navegador.findElement(By.xpath("//option[@value='25']")).click();
        //clicar em remover
        navegador.findElement(By.xpath("//input[@id='remove']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Excluir Estudantes da Lição")
    @Test
    public void excluirEstudantes(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar nos três pontos
        navegador.findElement(By.xpath("(//i[contains(@title,'Editar')])[158]")).click();
        //clicar em Atribuir Papel
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-user-circle fa-fw')]")).click();
        //clicar no papel de Estudante
        navegador.findElement(By.xpath("//a[normalize-space()='Moderador']")).click();
        //clicar na pessoa escolhida para ser excluida
        navegador.findElement(By.xpath("//option[@value='32']")).click();
        //clicar em remover
        navegador.findElement(By.xpath("//input[@id='remove']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//button[@type='submit']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Criar Lição com Descrição")
    @Test
    public void licaoComDescrição(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em criar atividade ou recurso
        navegador.findElement(By.xpath("(//button[@data-action='open-chooser'])[2]")).click();
        //clica em criar uma nova lição
        navegador.findElement(By.xpath("//div[@class='tab-pane active ']//a[@title='Adicionar um novo Lição']")).click();
        //clica no nome e digita
        navegador.findElement(By.xpath("//input[@id='id_name']")).sendKeys("Lição Teste com Descrição");
        //clicar no campo da descrição e digitar
        navegador.findElement(By.xpath("//div[@id='id_introeditoreditable']")).sendKeys("Descrição teste da Lição");
        //clica em exibir a descrição na página do curso
        navegador.findElement(By.xpath("//input[@id='id_showdescription']")).click();
        //salva e volta ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Editar a aparência da Lição, Mídia Vinculada")
    @Test
    public void midiaVinculada(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em arquivos
        navegador.findElement(By.xpath("//i[contains(@class,'icon fa fa-file-o fa-fw')]")).click();
        //clicar no campo da url
        navegador.findElement(By.xpath("//input[@id='fileurl']")).sendKeys("https://images.app.goo.gl/uk6c8B6Y8NgW631X9");
        //clicar em download
        navegador.findElement(By.xpath("//button[@class='fp-login-submit btn-primary btn']")).click();
        //clicar na imagem
        navegador.findElement(By.xpath("//p[normalize-space()='algoritmo-1024x576.jpg']")).click();
        //clicar em
        navegador.findElement(By.xpath("//button[normalize-space()='Selecione este arquivo']")).click();
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Visualizar Pontuação Corrente")
    @Test
    public void visualizarPontuacaoCorrente(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_ongoing']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_ongoing']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Nota mínima para exibição do menu")
    @Test
    public void notaMinima(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na nota
        navegador.findElement(By.xpath("//select[@id='id_displayleftif']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_displayleftif']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Apresentação de Slides")
    @Test
    public void apresentacaoSlides(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_slideshow']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_slideshow']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }



    @DisplayName("Use o feedback padrão")
    @Test
    public void feedbackPadrao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_feedback']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_feedback']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Barra de Progresso")
    @Test
    public void barraProgresso(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_progressbar']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_progressbar']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Mostrar Menu")
    @Test
    public void mostrarMenu(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_displayleft']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_displayleft']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Lição Disponivel a partit de que dia")
    @Test
    public void disponivelapartirdequedia(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em Disponibilidade
        navegador.findElement(By.xpath("//a[@href='#id_availabilityhdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_availabilityhdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em habilitar
        navegador.findElement(By.xpath("//div[@data-groupname='available']//div[@data-fieldtype='date_time_selector']//fieldset[@data-fieldtype='date_time']//div//label[@data-fieldtype='checkbox'][normalize-space()='Habilitar']")).click();
        //clicar no calendário
        navegador.findElement(By.xpath("//a[@id='id_available_calendar']//i[@title='Calendário']")).click();
        //clicar no dia
        navegador.findElement(By.xpath("(//td[@role='gridcell'][normalize-space()='6'])[2]")).click();
        //clicar em salvar e voltar
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Prazo Final da Lição")
    @Test
    public void prazofinal(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em Disponibilidade
        navegador.findElement(By.xpath("//a[@href='#id_availabilityhdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_availabilityhdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em habilitar
        navegador.findElement(By.xpath("//input[@id='id_deadline_enabled']")).click();
        //clicar no calendário
        navegador.findElement(By.xpath("//a[@id='id_deadline_calendar']//i[@title='Calendário']")).click();
        //clicar no mês, para andar, vai para janeiro
        navegador.findElement(By.xpath("//a[@aria-label='Go to next month']")).click();
        //clicar no dia, no caso dia 5
        navegador.findElement(By.xpath("//tbody/tr[1]/td[1]")).click();
        //clicar em salvar e voltar
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();

    }

    @DisplayName("Limite de Tempo da Lição")
    @Test
    public void limiteTempo(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em Disponibilidade
        navegador.findElement(By.xpath("//a[@href='#id_availabilityhdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_availabilityhdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em habilitar
        navegador.findElement(By.xpath("//div[@data-groupname='available']//div[@data-fieldtype='date_time_selector']//fieldset[@data-fieldtype='date_time']//div//label[@data-fieldtype='checkbox'][normalize-space()='Habilitar']")).click();
        //clicar na quantidade e digitar
        navegador.findElement(By.xpath("//input[@id='id_timelimit_number']")).sendKeys("5");
        //clicar no tipo do tempo
        navegador.findElement(By.xpath("//select[@id='id_timelimit_timeunit']")).click();

        //clicar em salvar e voltar
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Lição protegida por senha")
    @Test
    public void protegidaSenha(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em disponibilidade
        navegador.findElement(By.xpath("//a[@href='#id_availabilityhdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@class='fcontainer collapseable collapse show']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em lição protegida por senha
        navegador.findElement(By.xpath("//select[@id='id_usepassword']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_usepassword']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Permitir que a lição seja realizada de forma offline")
    @Test
    public void formaOffline(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em disponibilidade
        navegador.findElement(By.xpath("//a[@href='#id_availabilityhdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@class='fcontainer collapseable collapse show']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar em lição protegida por senha
        navegador.findElement(By.xpath("//select[@id='id_allowofflineattempts']")).click();
        Select se2 = new Select(navegador.findElement(By.xpath("//select[@id='id_allowofflineattempts']")));
        se2.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Importar questões para a Lição")
    @Test
    public void importarQuestoes(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        //navegador.findElement(By.xpath("(//a[contains(@class,'aalink stretched-link')])[104]")).click();
        navegador.findElement(By.xpath("//li[97]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em importar questões
        navegador.findElement(By.xpath("//a[normalize-space()='Importar questões']")).click();
        //clicar no formato do arquivo
        //navegador.findElement(By.xpath("//div[@data-fieldtype='select']")).click();
        navegador.findElement(By.xpath("//select[@id='id_format']")).click();
        //Select se4 = new Select(navegador.findElement(By.xpath("//select[@id='id_format']")));
        //se4.selectByValue("1");
        //escolher o arquivo
        navegador.findElement(By.xpath("//input[@name='questionfilechoose']")).click();
        navegador.findElement(By.xpath("//span[normalize-space()='Utilizar uma URL']")).click();
        //clicar no campo da url e digitar
        navegador.findElement(By.xpath("//input[@id='fileurl']")).sendKeys("https://images.app.goo.gl/qABxpL7i6XboE3zD9");
        //clicar em download
        navegador.findElement(By.xpath("//button[normalize-space()='Download']")).click();
        //clicar na imagem
        navegador.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[2]/div[1]/div[3]")).click();
        //clicar em selecionar o arquivo
        navegador.findElement(By.xpath("//button[normalize-space()='Selecione este arquivo']")).click();
        //clicar em importar
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

    @DisplayName("Inserir página de conteúdo")
    @Test
    public void inserirPaginaConteudo(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        //navegador.findElement(By.xpath("(//a[contains(@class,'aalink stretched-link')])[104]")).click();
        navegador.findElement(By.xpath("//li[77]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em inserir página de conteúdo
        navegador.findElement(By.xpath("//a[normalize-space()='Inserir página de conteúdo']")).click();
        //clicar no título da página
        navegador.findElement(By.xpath("//input[@id='id_title']")).sendKeys("Lógica da Programação");
        //clicar no conteúdo da página
        navegador.findElement(By.xpath("//div[@id='id_contents_editoreditable']")).sendKeys("Lógica de programação é a organização coesa de uma sequência de instruções voltadas à resolução de um problema, ou à criação de um software ou aplicação. A lógica de programação é o conhecimento anterior a qualquer outro quando falamos em desenvolvimento web porque é a partir dele que os aprendizados posteriores, como por exemplo o das linguagens de programação, fará sentido.");
        //clicar no link texto do primeiro conteúdo
        navegador.findElement(By.xpath("//fieldset[2]//div[2]//div[1]//div[2]//input[1]")).sendKeys("Lógica de programação é a organização coesa de uma sequência de instruções voltadas à resolução de um problema, ou à criação de um software ou aplicação.");
        //clicar em salvar páginas
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

    @DisplayName("Editar o conteúdo da página")
    @Test
    public void editarconteudopagina(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        navegador.findElement(By.xpath("//li[76]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em editar o conteúdo da página
        navegador.findElement(By.xpath("//button[normalize-space()='Editar o conteúdo desta página']")).click();
        //clicar em expandir tudo
        navegador.findElement(By.xpath("//span[@class='expandall']")).click();
        //clicar no conteúdo dois
        navegador.findElement(By.xpath("//div[@class='fcontainer collapseable collapse show']//div[2]//input[1]")).sendKeys("Para conseguirmos o objetivo de instruir o computador a fazer alguma coisa, precisamos de uma linguagem de programação, que é um meio estruturado para passar instruções para a máquina.");
        //clicar em salvar
        navegador.findElement(By.xpath("//input[@value='Salvar página']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();


    }

    @DisplayName("Editar Lição")
    @Test
    public void editarLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        navegador.findElement(By.xpath("//li[76]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em editar lição
        navegador.findElement(By.xpath("//button[normalize-space()='Editar lição']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Excluir página da Lição")
    @Test
    public void excluirpaginaLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        navegador.findElement(By.xpath("//li[76]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em editar lição
        navegador.findElement(By.xpath("//button[normalize-space()='Editar lição']")).click();
        //clicar no icone de excluir
        navegador.findElement(By.xpath("//i[@title='Excluir página: Lógica da Programação']")).click();
        //clicar em sim
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

    @DisplayName("Número máximo de respostas")
    @Test
    public void numeroMaximoRespostas(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clica no ícone de três pontos
        navegador.findElement(By.xpath("//div[@data-activityname='Lição Teste']//i[@title='Editar']")).click();
        //clica em editar configurações
        navegador.findElement(By.xpath("//div[@class='dropdown-menu menu dropdown-menu-right show']//i[contains(@class,'icon fa fa-cog fa-fw')]")).click();
        //clicar em aparência
        navegador.findElement(By.xpath("//a[@href='#id_appearancehdrcontainer']")).click();
        //clicar em mostrar mais
        navegador.findElement(By.xpath("//div[@id='id_appearancehdrcontainer']//a[@role='button'][normalize-space()='Mostrar mais ...']")).click();
        //clicar na visualização
        navegador.findElement(By.xpath("//select[@id='id_maxanswers']")).click();
        Select se3= new Select(navegador.findElement(By.xpath("//select[@id='id_maxanswers']")));
        se3.selectByValue("1");
        //clicar em salvar e voltar ao curso
        navegador.findElement(By.xpath("//input[@value='Salvar e voltar ao curso']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }

    @DisplayName("Inserir Cluster (Conjunto)")
    @Test
    public void inserirCluster(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar em lição
        //navegador.findElement(By.xpath("(//a[contains(@class,'aalink stretched-link')])[104]")).click();
        navegador.findElement(By.xpath("//li[97]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[2]//span[1]//a[1]")).click();
        //clicar em inserir Cluster
        navegador.findElement(By.xpath("//a[normalize-space()='Inserir cluster']")).click();
        //clicar em voltar
        navegador.findElement(By.xpath("//a[normalize-space()='Voltar']")).click();

        //sair deslogando
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //clica em menu
        navegador.findElement(By.id("user-menu-toggle")).click();
        //clica em sair
        navegador.findElement(By.className("dropdown-item")).click();

        //fechar o navegador
        navegador.close();
    }



    @DisplayName("Editar titulo da lição")
    @Test
    public void editarTituloLicao(){
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
        //clicar em meus cursos
        navegador.findElement(By.xpath("//a[contains(@role,'menuitem')][normalize-space()='Meus cursos']")).click();
        //clicar no curso
        navegador.findElement(By.xpath("//span[@class='multiline']")).click();
        //clicar em modo edição
        navegador.findElement(By.xpath("//input[@name='setmode']")).click();

        //clicar no icone de editar
        navegador.findElement(By.xpath("(//i[@title='Editar título'])[77]")).click();
        //clicar e mudar o nome
        navegador.findElement(By.xpath("(//span[@id='yui_3_17_2_1_1670613016250_288'])[1]")).sendKeys("Lição Teste Renomeada");

    }



}
