classDiagram
direction TB
    class Iphone {
    }
    class ReprodutorMusical {
	    tocarMusica()
	    pausarMusica()
	    selecionarMusica()
	    listaDeArtistas()
    }
    class AparelhoTelefonico {
	    mostrarTeclado()
	    ligar()
	    Atender()
	    iniciarCorreioDeVoz()
	    contatos()
	    recentes()
	    favoritos()
    }
    class NavegadorInternet {
	    exibirPagina()
	    AdicionarNovaPagina()
	    atualizarPagina()
	    historico()
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet

	classDef Ash :, stroke-width:1px, stroke-dasharray:none, stroke:#999999, fill:#EEEEEE, color:#000000
	classDef Peach :, stroke-width:1px, stroke-dasharray:none, stroke:#FBB35A, fill:#FFEFDB, color:#8F632D
