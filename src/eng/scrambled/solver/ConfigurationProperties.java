package eng.scrambled.solver;

import java.io.File;

public  interface ConfigurationProperties {
	String WordList_Source = "https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt";
	File Download_Words_Into = new File("C:\\tmp\\test\\words\\words_alpha.txt");
}
