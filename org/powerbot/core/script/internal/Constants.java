
package org.powerbot.core.script.internal;

import org.powerbot.core.script.job.Task;
import java.util.Map;

public class Constants
{
    public final int MINIMAP_SETTINGS_ON;
    public final int CLIENTSTATE_3;
    public final int CLIENTSTATE_7;
    public final int CLIENTSTATE_9;
    public final int CLIENTSTATE_11;
    public final int CLIENTSTATE_12;
    public final int VIEWPORT_XOFF;
    public final int VIEWPORT_XX;
    public final int VIEWPORT_XY;
    public final int VIEWPORT_XZ;
    public final int VIEWPORT_YOFF;
    public final int VIEWPORT_YX;
    public final int VIEWPORT_YY;
    public final int VIEWPORT_YZ;
    public final int VIEWPORT_ZOFF;
    public final int VIEWPORT_ZX;
    public final int VIEWPORT_ZY;
    public final int VIEWPORT_ZZ;
    public static boolean a;
    
    public Constants(final Map<Integer, Integer> map) {
        final boolean a = Constants.a;
        this.MINIMAP_SETTINGS_ON = map.get(0);
        this.CLIENTSTATE_3 = map.get(1);
        this.CLIENTSTATE_7 = map.get(2);
        this.CLIENTSTATE_9 = map.get(3);
        this.CLIENTSTATE_11 = map.get(4);
        this.CLIENTSTATE_12 = map.get(5);
        this.VIEWPORT_XOFF = map.get(6);
        this.VIEWPORT_XX = map.get(7);
        this.VIEWPORT_XY = map.get(8);
        this.VIEWPORT_XZ = map.get(9);
        this.VIEWPORT_YOFF = map.get(10);
        this.VIEWPORT_YX = map.get(11);
        this.VIEWPORT_YY = map.get(12);
        this.VIEWPORT_YZ = map.get(13);
        this.VIEWPORT_ZOFF = map.get(14);
        this.VIEWPORT_ZX = map.get(15);
        this.VIEWPORT_ZY = map.get(16);
        this.VIEWPORT_ZZ = map.get(17);
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    public static String e(final String s) {
        final int n = 5 << 4 ^ (0x2 ^ 0x5);
        final char c = '\u0005';
        final int length = s.length();
        final char[] array = new char[length];
        int n2;
        int i = n2 = length - 1;
        final char[] value = array;
        final char c2 = c;
        final int n3 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n2;
            final char char1 = s.charAt(index);
            --n2;
            array2[index] = (char)(char1 ^ n3);
            if (n2 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n2;
            final char c3 = (char)(s.charAt(index2) ^ c2);
            --n2;
            array3[index2] = c3;
            i = n2;
        }
        return new String(value);
    }
}
