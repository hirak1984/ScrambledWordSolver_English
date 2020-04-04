package eng.scrambled.solver;

import java.io.IOException;

public class StartHere {

	static {

		System.setProperty("javax.net.ssl.trustStore", "C:\\jdk1.8.0_74\\jre\\lib\\security\\github");
		System.setProperty("javax.net.ssl.trustStorePassword", "github");
	}

	public static void main(String[] args) throws IOException {
		// Downloading the raw data is a onetime process. So it's a separate ad-hoc
		// code.

		/*
		 * // Download (if not done already)
		 * Downloader.downLoad(ConfigurationProperties.WordList_Source,
		 * ConfigurationProperties.Download_Words_Into);
		 */
		// Find
		String scrambledCharacters = "eeiilvnost";
		Finder.findAllWordsContainingCharacters(ConfigurationProperties.Download_Words_Into, scrambledCharacters,false);
	}

}
