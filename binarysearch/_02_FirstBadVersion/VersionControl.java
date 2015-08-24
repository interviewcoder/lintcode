package _02_FirstBadVersion;

public class VersionControl {
    
    private static boolean[] versions;

    public static boolean isBadVersion(int v) {
        return v > 0 && v < versions.length + 1 && versions[v - 1];
    }
    
    public static void setControls(boolean[] controls) {
        versions = controls;
    }

}
