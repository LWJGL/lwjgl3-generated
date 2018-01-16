/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_PerformanceTest_t {
 *     uint32_t m_nFidelityLevel;
 * }</pre></code>
 */
@NativeType("struct VREvent_PerformanceTest_t")
public class VREventPerformanceTest extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NFIDELITYLEVEL;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NFIDELITYLEVEL = layout.offsetof(0);
    }

    VREventPerformanceTest(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventPerformanceTest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventPerformanceTest(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_nFidelityLevel} field. */
    @NativeType("uint32_t")
    public int m_nFidelityLevel() { return nm_nFidelityLevel(address()); }

    // -----------------------------------

    /** Returns a new {@link VREventPerformanceTest} instance for the specified memory address. */
    public static VREventPerformanceTest create(long address) {
        return new VREventPerformanceTest(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventPerformanceTest createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VREventPerformanceTest.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VREventPerformanceTest.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VREventPerformanceTest.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_nFidelityLevel}. */
    public static int nm_nFidelityLevel(long struct) { return memGetInt(struct + VREventPerformanceTest.M_NFIDELITYLEVEL); }

    // -----------------------------------

    /** An array of {@link VREventPerformanceTest} structs. */
    public static class Buffer extends StructBuffer<VREventPerformanceTest, Buffer> {

        /**
         * Creates a new {@link VREventPerformanceTest.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventPerformanceTest#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventPerformanceTest newInstance(long address) {
            return new VREventPerformanceTest(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code m_nFidelityLevel} field. */
        @NativeType("uint32_t")
        public int m_nFidelityLevel() { return VREventPerformanceTest.nm_nFidelityLevel(address()); }

    }

}