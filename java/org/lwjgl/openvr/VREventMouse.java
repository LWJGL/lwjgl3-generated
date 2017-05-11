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
 * Used for simulated mouse events in overlay space.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; coords are in GL space, bottom left of the texture is 0,0</li>
 * <li>{@code button} &ndash; one of:<br><table><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Left}</td><td>{@link VR#EVRMouseButton_VRMouseButton_Right}</td></tr><tr><td>{@link VR#EVRMouseButton_VRMouseButton_Middle}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Mouse_t {
    float x;
    float y;
    uint32_t button;
}</code></pre>
 */
public class VREventMouse extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        BUTTON;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        BUTTON = layout.offsetof(2);
    }

    VREventMouse(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventMouse} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventMouse(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    public float x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    public float y() { return ny(address()); }
    /** Returns the value of the {@code button} field. */
    public int button() { return nbutton(address()); }

    /** Sets the specified value to the {@code x} field. */
    public VREventMouse x(float value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public VREventMouse y(float value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code button} field. */
    public VREventMouse button(int value) { nbutton(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventMouse set(
        float x,
        float y,
        int button
    ) {
        x(x);
        y(y);
        button(button);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventMouse set(VREventMouse src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventMouse} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventMouse malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventMouse} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventMouse calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventMouse} instance allocated with {@link BufferUtils}. */
    public static VREventMouse create() {
        return new VREventMouse(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventMouse} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventMouse create(long address) {
        return address == NULL ? null : new VREventMouse(address, null);
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventMouse.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventMouse} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventMouse mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventMouse} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventMouse callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventMouse} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventMouse mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventMouse} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventMouse callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventMouse.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static float nx(long struct) { return memGetFloat(struct + VREventMouse.X); }
    /** Unsafe version of {@link #y}. */
    public static float ny(long struct) { return memGetFloat(struct + VREventMouse.Y); }
    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return memGetInt(struct + VREventMouse.BUTTON); }

    /** Unsafe version of {@link #x(float) x}. */
    public static void nx(long struct, float value) { memPutFloat(struct + VREventMouse.X, value); }
    /** Unsafe version of {@link #y(float) y}. */
    public static void ny(long struct, float value) { memPutFloat(struct + VREventMouse.Y, value); }
    /** Unsafe version of {@link #button(int) button}. */
    public static void nbutton(long struct, int value) { memPutInt(struct + VREventMouse.BUTTON, value); }

    // -----------------------------------

    /** An array of {@link VREventMouse} structs. */
    public static class Buffer extends StructBuffer<VREventMouse, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventMouse.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventMouse#SIZEOF}, and its mark will be undefined.
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
        protected VREventMouse newInstance(long address) {
            return new VREventMouse(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        public float x() { return VREventMouse.nx(address()); }
        /** Returns the value of the {@code y} field. */
        public float y() { return VREventMouse.ny(address()); }
        /** Returns the value of the {@code button} field. */
        public int button() { return VREventMouse.nbutton(address()); }

        /** Sets the specified value to the {@code x} field. */
        public VREventMouse.Buffer x(float value) { VREventMouse.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public VREventMouse.Buffer y(float value) { VREventMouse.ny(address(), value); return this; }
        /** Sets the specified value to the {@code button} field. */
        public VREventMouse.Buffer button(int value) { VREventMouse.nbutton(address(), value); return this; }

    }

}