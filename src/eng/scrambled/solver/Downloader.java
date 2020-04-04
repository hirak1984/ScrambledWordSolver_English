package eng.scrambled.solver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Downloader {



	public static void downLoad(String url, File targetFile) throws IOException {
		URL website = new URL(url);
		try (InputStream inputStream = website.openStream();
				ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
				FileOutputStream fileOutputStream = new FileOutputStream(targetFile)) {
			fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, 1 << 24);
		}
	}


	public static void main(String[] args) throws IOException {

		downLoad(ConfigurationProperties.WordList_Source, ConfigurationProperties.Download_Words_Into);

	}
}
