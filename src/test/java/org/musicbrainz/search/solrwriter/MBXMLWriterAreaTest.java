package org.musicbrainz.search.solrwriter;

import java.util.ArrayList;
import java.util.Arrays;

public class MBXMLWriterAreaTest extends MBXMLWriterTest {
	static {
		corename = "area";
		doc = new ArrayList<>(Arrays.asList(new String[]{
				"area", "Thüringen",
				"mbid", uuid}));
	}

}
