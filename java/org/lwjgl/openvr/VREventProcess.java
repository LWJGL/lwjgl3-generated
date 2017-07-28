/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Used for events about processes.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Process_t {
 *     uint32_t pid;
 *     uint32_t oldPid;
 *     bool bForced;
 * }</pre></code>
 */
@NativeType("struct VREvent_Process_t")
public class VREventProcess extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PID,
        OLDPID,
        BFORCED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PID = layout.offsetof(0);
        OLDPID = layout.offsetof(1);
        BFORCED = layout.offsetof(2);
    }

    VREventProcess(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventProcess} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventProcess(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code pid} field. */
    @NativeType("uint32_t")
    public int pid() { return npid(address()); }
    /** Returns the value of the {@code oldPid} field. */
    @NativeType("uint32_t")
    public int oldPid() { return noldPid(address()); }
    /** Returns the value of the {@code bForced} field. */
    @NativeType("bool")
    public boolean bForced() { return nbForced(address()); }

    /** Sets the specified value to the {@code pid} field. */
    public VREventProcess pid(@NativeType("uint32_t") int value) { npid(address(), value); return this; }
    /** Sets the specified value to the {@code oldPid} field. */
    public VREventProcess oldPid(@NativeType("uint32_t") int value) { noldPid(address(), value); return this; }
    /** Sets the specified value to the {@code bForced} field. */
    public VREventProcess bForced(@NativeType("bool") boolean value) { nbForced(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventProcess set(
        int pid,
        int oldPid,
        boolean bForced
    ) {
        pid(pid);
        oldPid(oldPid);
        bForced(bForced);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventProcess set(VREventProcess src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventProcess} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventProcess malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventProcess} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventProcess calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventProcess} instance allocated with {@link BufferUtils}. */
    public static VREventProcess create() {
        return new VREventProcess(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventProcess} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventProcess create(long address) {
        return address == NULL ? null : new VREventProcess(address, null);
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventProcess.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventProcess} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventProcess mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventProcess} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventProcess callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventProcess} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventProcess mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventProcess} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventProcess callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventProcess.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pid}. */
    public static int npid(long struct) { return memGetInt(struct + VREventProcess.PID); }
    /** Unsafe version of {@link #oldPid}. */
    public static int noldPid(long struct) { return memGetInt(struct + VREventProcess.OLDPID); }
    /** Unsafe version of {@link #bForced}. */
    public static boolean nbForced(long struct) { return memGetByte(struct + VREventProcess.BFORCED) != 0; }

    /** Unsafe version of {@link #pid(int) pid}. */
    public static void npid(long struct, int value) { memPutInt(struct + VREventProcess.PID, value); }
    /** Unsafe version of {@link #oldPid(int) oldPid}. */
    public static void noldPid(long struct, int value) { memPutInt(struct + VREventProcess.OLDPID, value); }
    /** Unsafe version of {@link #bForced(boolean) bForced}. */
    public static void nbForced(long struct, boolean value) { memPutByte(struct + VREventProcess.BFORCED, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link VREventProcess} structs. */
    public static class Buffer extends StructBuffer<VREventProcess, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventProcess.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventProcess#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventProcess newInstance(long address) {
            return new VREventProcess(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code pid} field. */
        @NativeType("uint32_t")
        public int pid() { return VREventProcess.npid(address()); }
        /** Returns the value of the {@code oldPid} field. */
        @NativeType("uint32_t")
        public int oldPid() { return VREventProcess.noldPid(address()); }
        /** Returns the value of the {@code bForced} field. */
        @NativeType("bool")
        public boolean bForced() { return VREventProcess.nbForced(address()); }

        /** Sets the specified value to the {@code pid} field. */
        public VREventProcess.Buffer pid(@NativeType("uint32_t") int value) { VREventProcess.npid(address(), value); return this; }
        /** Sets the specified value to the {@code oldPid} field. */
        public VREventProcess.Buffer oldPid(@NativeType("uint32_t") int value) { VREventProcess.noldPid(address(), value); return this; }
        /** Sets the specified value to the {@code bForced} field. */
        public VREventProcess.Buffer bForced(@NativeType("bool") boolean value) { VREventProcess.nbForced(address(), value); return this; }

    }

}