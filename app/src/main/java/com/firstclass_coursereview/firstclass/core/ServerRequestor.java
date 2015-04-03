package com.firstclass_coursereview.firstclass.core;

/**
 * Created by jialiangtan on 4/1/15.
 */
public class ServerRequestor implements IServerRequestor {
    private ServerRequestor serverRequestor;

    private ServerRequestor() {
        // TODO
    }

    @Override
    public IServerRequestor getInstance() {
        if (serverRequestor == null) {
            serverRequestor = new ServerRequestor();
        }
        return serverRequestor;
    }

    /**
     * query for a result of a {@link java.lang.String} type
     * @param sqlQuery
     */
    private String queryForStringResult(String sqlQuery) {
        // TODO
        return null;
    }

    /**
     * query for a result of an {@link java.lang.Object} type
     * @param sqlQuery
     */
    private Object queryForObjectResult(String sqlQuery) {
        // TODO
        return null;
    }


}
