/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes a layer of type {@link OVR#ovrLayerType_Cube LayerType_Cube} which is a single timewarped cubemap at infinity. When looking down the recentered origin's -Z axis, +X face
 * is left and +Y face is up. Similarly, if headlocked the +X face is left, +Y face is up and -Z face is forward. Note that the coordinate system is
 * left-handed.
 * 
 * <p>{@link OVR#ovrLayerFlag_TextureOriginAtBottomLeft LayerFlag_TextureOriginAtBottomLeft} flag is not supported by {@code ovrLayerCube}.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; {@code Header.Type} must be {@link OVR#ovrLayerType_Cube LayerType_Cube}</li>
 * <li>{@code Orientation} &ndash; orientation of the cube</li>
 * <li>{@code CubeMapTexture} &ndash; contains a single cubemap swapchain (not a stereo pair of swapchains)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrLayerCube {
 *     {@link OVRLayerHeader ovrLayerHeader} Header;
 *     {@link OVRQuatf ovrQuatf} Orientation;
 *     ovrTextureSwapChain CubeMapTexture;
 * }</pre></code>
 */
@NativeType("struct ovrLayerCube")
public class OVRLayerCube extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        ORIENTATION,
        CUBEMAPTEXTURE;

    static {
        Layout layout = __struct(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
            __member(OVRQuatf.SIZEOF, OVRQuatf.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        ORIENTATION = layout.offsetof(1);
        CUBEMAPTEXTURE = layout.offsetof(2);
    }

    OVRLayerCube(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRLayerCube} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerCube(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
    @NativeType("ovrQuatf")
    public OVRQuatf Orientation() { return nOrientation(address()); }
    /** Returns the value of the {@code CubeMapTexture} field. */
    @NativeType("ovrTextureSwapChain")
    public long CubeMapTexture() { return nCubeMapTexture(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
    public OVRLayerCube Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
    public OVRLayerCube Orientation(@NativeType("ovrQuatf") OVRQuatf value) { nOrientation(address(), value); return this; }
    /** Sets the specified value to the {@code CubeMapTexture} field. */
    public OVRLayerCube CubeMapTexture(@NativeType("ovrTextureSwapChain") long value) { nCubeMapTexture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRLayerCube set(
        OVRLayerHeader Header,
        OVRQuatf Orientation,
        long CubeMapTexture
    ) {
        Header(Header);
        Orientation(Orientation);
        CubeMapTexture(CubeMapTexture);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerCube set(OVRLayerCube src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerCube} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerCube malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVRLayerCube} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerCube calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVRLayerCube} instance allocated with {@link BufferUtils}. */
    public static OVRLayerCube create() {
        return new OVRLayerCube(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRLayerCube} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVRLayerCube create(long address) {
        return address == NULL ? null : new OVRLayerCube(address, null);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRLayerCube.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerCube} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRLayerCube mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRLayerCube} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRLayerCube callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCube} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCube mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCube} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerCube callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerCube.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerCube.HEADER); }
    /** Unsafe version of {@link #Orientation}. */
    public static OVRQuatf nOrientation(long struct) { return OVRQuatf.create(struct + OVRLayerCube.ORIENTATION); }
    /** Unsafe version of {@link #CubeMapTexture}. */
    public static long nCubeMapTexture(long struct) { return memGetAddress(struct + OVRLayerCube.CUBEMAPTEXTURE); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerCube.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #Orientation(OVRQuatf) Orientation}. */
    public static void nOrientation(long struct, OVRQuatf value) { memCopy(value.address(), struct + OVRLayerCube.ORIENTATION, OVRQuatf.SIZEOF); }
    /** Unsafe version of {@link #CubeMapTexture(long) CubeMapTexture}. */
    public static void nCubeMapTexture(long struct, long value) { memPutAddress(struct + OVRLayerCube.CUBEMAPTEXTURE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + OVRLayerCube.CUBEMAPTEXTURE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link OVRLayerCube} structs. */
    public static class Buffer extends StructBuffer<OVRLayerCube, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRLayerCube.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerCube#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerCube newInstance(long address) {
            return new OVRLayerCube(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerCube.nHeader(address()); }
        /** Returns a {@link OVRQuatf} view of the {@code Orientation} field. */
        @NativeType("ovrQuatf")
        public OVRQuatf Orientation() { return OVRLayerCube.nOrientation(address()); }
        /** Returns the value of the {@code CubeMapTexture} field. */
        @NativeType("ovrTextureSwapChain")
        public long CubeMapTexture() { return OVRLayerCube.nCubeMapTexture(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
        public OVRLayerCube.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerCube.nHeader(address(), value); return this; }
        /** Copies the specified {@link OVRQuatf} to the {@code Orientation} field. */
        public OVRLayerCube.Buffer Orientation(@NativeType("ovrQuatf") OVRQuatf value) { OVRLayerCube.nOrientation(address(), value); return this; }
        /** Sets the specified value to the {@code CubeMapTexture} field. */
        public OVRLayerCube.Buffer CubeMapTexture(@NativeType("ovrTextureSwapChain") long value) { OVRLayerCube.nCubeMapTexture(address(), value); return this; }

    }

}