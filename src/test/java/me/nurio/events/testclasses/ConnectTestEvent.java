package me.nurio.events.testclasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import me.nurio.events.Event;

@Data
@AllArgsConstructor
public class ConnectTestEvent extends Event {
    private String whoIsConnecting;
}