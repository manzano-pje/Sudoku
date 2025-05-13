package br.com.pjem.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.pjem.service.EventEnum.CLEAR_SPACE;

public class NotifierService {

    private final Map<br.com.pjem.service.EventEnum, List<EventListener>> listeners = new HashMap<>(){{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final br.com.pjem.service.EventEnum eventType, EventListener listener){
        var selectedListeners = listeners.get(eventType);
        selectedListeners.add(listener);
    }

    public void notify(final br.com.pjem.service.EventEnum eventType){
        listeners.get(eventType).forEach(l -> l.update(eventType));
    }

}
