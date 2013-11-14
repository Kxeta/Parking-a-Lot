package br.com.parkingalot;

import android.app.Activity;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Util extends Activity{
	
	/* Padrões para nomes de objetos:
	 * 	TextView tv_(nome sugestivo)
	 * 	ImageView iv_(nome sugestivo)
	 * 	EditText et_(nome sugestivo)
	 * 	RelativeLayout rl_(nome sugestivo)
	 */
	
	/*Atenção! (Padrão que eu costumo utilizar...podemos conversar e alterar)
	 * 	Sempre que criar alguma tela, adicione nesta activity o tipo e o nome do objeto 
	 * que será utilizado na activity referente a tela. Feito isso, faça a nova activity
	 * extender Util 
	 */
	
	
	
	RelativeLayout rl_splash;
	TextView tv_carregando_splash;
	
	//Método para esconder o teclado virtual do android
	public static void hideSoftKeyboard(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager)  activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
     }
	//Método que define a ação do botão voltar do smartphone
	public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
        	finish();//Finaliza a activity que está rodando.
        	return false;
        }
        return super.onKeyDown(keyCode, event);
	}
	//Método para definir a fonte de um textview para a TITANIA (Se encontra na pasta assets/fonts)
	public void TitaniaFont(TextView tv){
	Typeface tf = Typeface.createFromAsset(getAssets(),
	        "fonts/Titania.ttf");
	tv.setTypeface(tf);
	}
	//Método para definir a fonte de um textview para a Polo SemiBold (Se encontra na pasta assets/fonts)
	public void PoloFont(TextView tv){
		Typeface tf = Typeface.createFromAsset(getAssets(),
		        "fonts/PoloSemiBold.ttf");
		tv.setTypeface(tf);
		}
	

}
