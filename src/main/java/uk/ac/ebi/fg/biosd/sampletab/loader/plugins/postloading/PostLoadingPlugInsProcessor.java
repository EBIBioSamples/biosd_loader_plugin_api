package uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading;

import java.util.ServiceLoader;

import uk.ac.ebi.fg.biosd.model.organizational.MSI;

/**
 * TODO: Comment me!
 *
 * <dl><dt>date</dt><dd>5 Aug 2013</dd></dl>
 * @author Marco Brandizi
 *
 */
public class PostLoadingPlugInsProcessor
{
	private ServiceLoader<PostLoadingPlugIn> plugIns = ServiceLoader.load ( PostLoadingPlugIn.class );
	
	public PostLoadingPlugInsProcessor () {}

	public void run ( MSI msi )
	{
		for ( PostLoadingPlugIn plugIn: plugIns )
			plugIn.run ( msi );
	}
}
