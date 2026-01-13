package Team4450.Robot26.utility;

import edu.wpi.first.math.geometry.Pose3d;

public class VisionPose {
    public Pose3d pose;
    public long timestamp;
    public VisionPose nextNode;

    VisionPose(Pose3d pose, long timestamp) {
        this.pose = pose;
        this.timestamp = timestamp;
    }
}
