package uk.ac.ebi.fg.biosd.sampletab.loader.plugins.postloading;

import uk.ac.ebi.fg.biosd.model.organizational.MSI;

/**
 * TODO: Comment me!
 *
 * <dl><dt>date</dt><dd>5 Aug 2013</dd></dl>
 * @author Marco Brandizi
 *
 */
public interface PostLoadingPlugIn
{
	public void run ( MSI msi );
}
