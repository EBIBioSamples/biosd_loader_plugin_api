package uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading;

import uk.ac.ebi.fg.biosd.model.organizational.MSI;
import uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading.PostLoadingPlugIn;

/**
 * TODO: Comment me!
 *
 * <dl><dt>date</dt><dd>5 Aug 2013</dd></dl>
 * @author Marco Brandizi
 *
 */
public class TestPostLoadingPlugIn implements PostLoadingPlugIn
{
	public TestPostLoadingPlugIn ()
	{
	}

	@Override
	public void run ( MSI msi )
	{
		if ( msi != PlugInTest.TEST_MSI ) return;
		msi.setTitle ( msi.getTitle () + " [tweaked by test plug-in]" );
	}
	
}
