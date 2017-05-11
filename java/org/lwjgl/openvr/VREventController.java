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
 * Used for controller button events.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code button} &ndash; one of:<br><table><tr><td>{@link VR#EVRButtonId_k_EButton_System}</td><td>{@link VR#EVRButtonId_k_EButton_ApplicationMenu}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Grip}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Left}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Up}</td><td>{@link VR#EVRButtonId_k_EButton_DPad_Right}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_DPad_Down}</td><td>{@link VR#EVRButtonId_k_EButton_A}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_ProximitySensor}</td><td>{@link VR#EVRButtonId_k_EButton_Axis0}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis1}</td><td>{@link VR#EVRButtonId_k_EButton_Axis2}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Axis3}</td><td>{@link VR#EVRButtonId_k_EButton_Axis4}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Touchpad}</td><td>{@link VR#EVRButtonId_k_EButton_SteamVR_Trigger}</td></tr><tr><td>{@link VR#EVRButtonId_k_EButton_Dashboard_Back}</td><td>{@link VR#EVRButtonId_k_EButton_Max}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Controller_t {
    uint32_t button;
}</code></pre>
 */
public class VREventController extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUTTON;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUTTON = layout.offsetof(0);
    }

    VREventController(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventController} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventController(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code button} field. */
    public int button() { return nbutton(address()); }

    /** Sets the specified value to the {@code button} field. */
    public VREventController button(int value) { nbutton(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventController set(VREventController src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventController} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventController malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventController} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventController calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventController} instance allocated with {@link BufferUtils}. */
    public static VREventController create() {
        return new VREventController(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventController} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventController create(long address) {
        return address == NULL ? null : new VREventController(address, null);
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VREventController.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventController} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventController mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventController} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventController callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventController} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventController mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventController} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventController callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventController.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #button}. */
    public static int nbutton(long struct) { return memGetInt(struct + VREventController.BUTTON); }

    /** Unsafe version of {@link #button(int) button}. */
    public static void nbutton(long struct, int value) { memPutInt(struct + VREventController.BUTTON, value); }

    // -----------------------------------

    /** An array of {@link VREventController} structs. */
    public static class Buffer extends StructBuffer<VREventController, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventController.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventController#SIZEOF}, and its mark will be undefined.
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
        protected VREventController newInstance(long address) {
            return new VREventController(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code button} field. */
        public int button() { return VREventController.nbutton(address()); }

        /** Sets the specified value to the {@code button} field. */
        public VREventController.Buffer button(int value) { VREventController.nbutton(address(), value); return this; }

    }

}