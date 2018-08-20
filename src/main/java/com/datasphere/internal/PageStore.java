package com.datasphere.internal;

import java.util.Map;

import com.datasphere.pojos.JsonPageParser;
import com.google.common.collect.Maps;

/**
 * An internal data store that is meant to be used to prevent reading a file system repeatedly for every element.
 */
public class PageStore {
    private static final Map<String, JsonPageParser> pageStore = Maps.newConcurrentMap();

    /**
     * @param page - A {@link REWebPage} object that needs to be persisted into an internal data store.
     */
    public static void addPage(JsonPageParser page) {
        if (pageStore.containsKey(page.getName())) {
            return;
        }
        pageStore.put(page.getName(), page);
    }

    /**
     * @param pageName - The name of a page that needs to be queried.
     * @return - A {@link REWebPage} object that matches the name which is being queried.
     */
    public static JsonPageParser getPage(String pageName) {
        return pageStore.get(pageName);
    }
}
