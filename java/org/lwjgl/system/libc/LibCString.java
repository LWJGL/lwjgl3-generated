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
    @NativeType("void *")
    public static long memset(@NativeType("void *") ByteBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memset(@NativeType("void *") ShortBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memset(@NativeType("void *") IntBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memset(@NativeType("void *") LongBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memset(@NativeType("void *") FloatBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memset(@NativeType("void *") DoubleBuffer dest, @NativeType("int") int c) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ByteBuffer dest, @NativeType("const void *") ByteBuffer src) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") ShortBuffer dest, @NativeType("const void *") ShortBuffer src) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") IntBuffer dest, @NativeType("const void *") IntBuffer src) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") LongBuffer dest, @NativeType("const void *") LongBuffer src) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") FloatBuffer dest, @NativeType("const void *") FloatBuffer src) {
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
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") DoubleBuffer dest, @NativeType("const void *") DoubleBuffer src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), src.remaining() << 3);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(byte[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") byte[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 0);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(short[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") short[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 1);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(int[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") int[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(long[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") long[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 3);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(float[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") float[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 2);
    }

    /** Array version of: {@link #nmemset} */
    public static native long nmemset(double[] dest, int c, long count);

    /** Array version of: {@link #memset} */
    @NativeType("void *")
    public static long memset(@NativeType("void *") double[] dest, @NativeType("int") int c) {
        return nmemset(dest, c, dest.length << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(byte[] dest, byte[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") byte[] dest, @NativeType("const void *") byte[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 0);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(short[] dest, short[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") short[] dest, @NativeType("const void *") short[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 1);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(int[] dest, int[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") int[] dest, @NativeType("const void *") int[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(long[] dest, long[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") long[] dest, @NativeType("const void *") long[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 3);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(float[] dest, float[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") float[] dest, @NativeType("const void *") float[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 2);
    }

    /** Array version of: {@link #nmemcpy} */
    public static native long nmemcpy(double[] dest, double[] src, long count);

    /** Array version of: {@link #memcpy} */
    @NativeType("void *")
    public static long memcpy(@NativeType("void *") double[] dest, @NativeType("const void *") double[] src) {
        if (CHECKS) {
            check(src, dest.length);
        }
        return nmemcpy(dest, src, dest.length << 3);
    }

    /**
     * Fills memory with a constant byte.
     *
     * @param dest pointer to destination
     * @param c    character to set
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memset(@NativeType("void *") T dest, @NativeType("int") int c) {
        return nmemset(memAddress(dest), c, (long)dest.remaining() * dest.sizeof());
    }

    /**
     * Copies characters between buffers.
     *
     * @param dest new buffer
     * @param src  buffer to copy from
     *
     * @return the value of {@code dest}
     */
    @NativeType("void *")
    public static <T extends CustomBuffer<T>> long memcpy(@NativeType("void *") T dest, @NativeType("const void *") T src) {
        if (CHECKS) {
            check(src, dest.remaining());
        }
        return nmemcpy(memAddress(dest), memAddress(src), (long)src.remaining() * src.sizeof());
    }

}