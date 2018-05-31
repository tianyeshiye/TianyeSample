package sample.kafka.consumer.high_level;

import kafka.utils.ZkUtils;

public class ZkOffsetReseter {
    private final String zookeeper;
    private final int zookeeperPort;
    private final String groupId;

    public ZkOffsetReseter(String zookeeper, int zookeeperPort, String groupId) {
        this.zookeeper = zookeeper;
        this.zookeeperPort = zookeeperPort;
        this.groupId = groupId;
    }

    public void reset() {
        ZkUtils.maybeDeletePath(zookeeper + ":" + zookeeperPort, "/consumers/" + groupId);
    }
}
