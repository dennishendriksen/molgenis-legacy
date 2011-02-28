package org.molgenis.fieldtypes;

import org.molgenis.framework.db.Database;
import org.molgenis.framework.ui.html.HtmlInput;
import org.molgenis.framework.ui.html.LongInput;
import org.molgenis.model.MolgenisModelException;

public class LongField extends FieldType
{
	@Override
	public String getJavaPropertyType()
	{
		return "Long";
	}

	@Override
	public String getJavaAssignment(String value)
	{
		if (value == null || value.equals("") ) return "null";
		return "" + Long.parseLong(value) + "L";
	}

	
	@Override
	public String getJavaPropertyDefault()
	{
		return getJavaAssignment(f.getDefaultValue());
	}
	
	@Override
	public String getMysqlType() throws MolgenisModelException
	{
		return "BIGINT";
	}

	@Override
	public String getHsqlType()
	{
		return "LONG";
	}
	@Override
	public String getXsdType()
	{
		return "boolean";
	}

	@Override
	public String getFormatString()
	{
		return "%d";
	}

	@Override
	public HtmlInput createInput(String name, String xrefEntityClassName,
			Database db) throws InstantiationException, IllegalAccessException
	{
		return new LongInput(name);
	}

}
