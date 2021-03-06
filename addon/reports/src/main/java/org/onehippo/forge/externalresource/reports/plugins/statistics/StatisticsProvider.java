package org.onehippo.forge.externalresource.reports.plugins.statistics;


import java.util.List;
import java.util.Map;

import org.apache.wicket.util.io.IClusterable;
import org.onehippo.forge.externalresource.reports.plugins.statistics.list.IStatisticsListColumn;

/**
 * @version $Id$
 */
public abstract class StatisticsProvider<T> implements IClusterable {

    public abstract List<IStatisticsListColumn> getColumns(String[] selectedColumns);

    public abstract List<T> getListData();

    public abstract Map<String, Long> getChartData();

    public abstract String allColumnNames();

}
