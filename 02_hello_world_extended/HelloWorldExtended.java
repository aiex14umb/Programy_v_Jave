/* Java na základe KOMENTÁROV automaticky ku každému súboru .java vytvrára tzv. JavaDoc (online dokumentáciu)
 * Preto je dôležité, aby komentáre mali nejakú štruktúru a boli tam. Nieje to preddefinované na 100% presne, 
 * ale úvodný koment (hlavička) vo všeobecnosti by mala vypadať takto:
 * Úvodný komentár a "komentáre nad funkciami" vždy začínajú "/**" nielen "/*" pretože ti to dá ďalšie možnosti 
 * komentárov, ako napr. automaticky za napísaním znaku "@" vyskočí v Eclipse (ale aj inde) kopa vecí, ktoré tam 
 * patria, alebo sám komentár ti spraví parametre a návratové typy a pod veci.
 */
/**
 * Názov: <b>Hello World - Extended</b>
 * Modul: HelloWorldExtended.java
 * Dátum: 01.11.2015
 * 
 * @author Dušan Pribišan
 * @version 1.1
 * @category Programy na Java
 */

public class HelloWorldExtended {
	public static void main(String[] args) {
		System.out.println("Hello, World!\n");

		for(int n = 1; n <= 100; n++) {
			System.out.println(n + " ");

			/*
			 * Kód č som dole zakomentoval je úplná zbytočnosť pretože:
			 * a) je nepotrebný, tým, že som hore zmenil print na println a za n som dopísal + " " 
			 * som spravil to, že budeš mať totálne rovnaký výsledok, ako v tvojom prípade (môžeš
			 * si to porovnať, ale...)
			 * 
			 * b) zrýchlyl a zefektívnil som program samotný. Operácie porovnania zaberajú veľľľľľľľľľľľľľľľľľľľľľa
			 * systémového času. Zaberajú čas CPU a značne spomaľujú program. Pri takejto malej blbosti to ani nezbadáš
			 * ale ak sa teraz naučíš písať kód takto bordelavo tak ti to ostane navždy a väčšie programy
			 * aj také ako budeme robiť na Prog2 ti kvôli tomuto budú:
			 * 1) veľmi neprehľadné a zle čitateľné,
			 * 2) pomalé
			 * 3) komplikované 
			 * 
			 * c) Takto upravý program je jednoduhší a napíšeš ho rýchlejšie a aj sám sa v ňom budeš lepšie orientovať.
			 */
			/* 
			if(n!=100){
				System.out.print(" ");
			}else{
				System.out.println();
			}
			*/
		}
	}
}
