/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.libc;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to string.h. */
public class LibCString {

    static { Library.initialize(); }

    protected LibCString() {
        throw new UnsupportedOperationException();
    }

    // --- [ memset ] ---

    /**
     * Unsafe version of: {@link #memset}
     *
     * @param count number of characters
     */
    public static native long nmemset(long dest, int c, long count);

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(ByteBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining());
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(ShortBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining() << 1);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(IntBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining() << 2);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(LongBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining() << 3);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(FloatBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining() << 2);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    public static long memset(DoubleBuffer dest, int c) {
        return nmemset(memAddress(dest), c, dest.remaining() << 3);
    }

    // --- [ memcpy ] ---

    /**
     * Unsafe version of: {@link #memcpy}
     *
     * @param count number of characters to copy
     */
    public static native long nmemcpy(long dest, long src, long count);

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(ByteBuffer dest, ByteBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), dest.remaining());
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(ShortBuffer dest, ShortBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 1);
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(IntBuffer dest, IntBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 2);
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(LongBuffer dest, LongBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 3);
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(FloatBuffer dest, FloatBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 2);
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    public static long memcpy(DoubleBuffer dest, DoubleBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 3);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(byte[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(byte[] dest, int c) {
        return nmemset(dest, c, dest.length << 0);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(short[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(short[] dest, int c) {
        return nmemset(dest, c, dest.length << 1);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(int[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(int[] dest, int c) {
        return nmemset(dest, c, dest.length << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(long[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(long[] dest, int c) {
        return nmemset(dest, c, dest.length << 3);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(float[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(float[] dest, int c) {
        return nmemset(dest, c, dest.length << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(double[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    public static long memset(double[] dest, int c) {
        return nmemset(dest, c, dest.length << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(byte[] dest, byte[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(byte[] dest, byte[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 0);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(short[] dest, short[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(short[] dest, short[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 1);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(int[] dest, int[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(int[] dest, int[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(long[] dest, long[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(long[] dest, long[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(float[] dest, float[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(float[] dest, float[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(double[] dest, double[] src, long count);

    /** Array version of: {@link #memcpy} */
    public static long memcpy(double[] dest, double[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 3);
    }

}