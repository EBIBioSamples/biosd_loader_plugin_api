package uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading;

import org.junit.Test;

import uk.ac.ebi.fg.biosd.model.organizational.MSI;
import uk.ac.ebi.fg.biosd.model.utils.test.TestModel;
import uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading.PostLoadingPlugInsProcessor;

import static org.junit.Assert.*;
import static java.lang.System.out;

/**
 * TODO: Comment me!
 *
 * <dl><dt>date</dt><dd>5 Aug 2013</dd></dl>
 * @author Marco Brandizi
 *
 */
public class PlugInTest
{
	public static final MSI TEST_MSI = new TestModel ().msi;
	
	@Test
	public void testLoading ()
	{
		TEST_MSI.setTitle ( "Test Title" );
		PostLoadingPlugInsProcessor processor = new PostLoadingPlugInsProcessor ();
		processor.run ( TEST_MSI );
		out.println ( "The new MSI title is '" + TEST_MSI.getTitle () + "'" );
		assertTrue ( "Test plug-in didn't work!", TEST_MSI.getTitle ().endsWith ( " [tweaked by test plug-in]" ) );
	}
}
