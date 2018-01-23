/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Union that combines {@code ovrLayer} types in a way that allows them to be used in a polymorphic way.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Header} &ndash; the layer header</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union ovrLayer_Union {
 *     {@link OVRLayerHeader ovrLayerHeader} Header;
 *     {@link OVRLayerEyeFov ovrLayerEyeFov} EyeFov;
 *     {@link OVRLayerEyeFovDepth ovrLayerEyeFovDepth} EyeFovDepth;
 *     {@link OVRLayerEyeFovMultires ovrLayerEyeFovMultires} Multires;
 *     {@link OVRLayerCylinder ovrLayerCylinder} Cylinder;
 *     {@link OVRLayerCube ovrLayerCube} Cube;
 *     {@link OVRLayerQuad ovrLayerQuad} Quad;
 * }</pre></code>
 */
@NativeType("union ovrLayer_Union")
public class OVRLayerUnion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADER,
        EYEFOV,
        EYEFOVDEPTH,
        MULTIRES,
        CYLINDER,
        CUBE,
        QUAD;

    static {
        Layout layout = __union(
            __member(OVRLayerHeader.SIZEOF, OVRLayerHeader.ALIGNOF),
            __member(OVRLayerEyeFov.SIZEOF, OVRLayerEyeFov.ALIGNOF),
            __member(OVRLayerEyeFovDepth.SIZEOF, OVRLayerEyeFovDepth.ALIGNOF),
            __member(OVRLayerEyeFovMultires.SIZEOF, OVRLayerEyeFovMultires.ALIGNOF),
            __member(OVRLayerCylinder.SIZEOF, OVRLayerCylinder.ALIGNOF),
            __member(OVRLayerCube.SIZEOF, OVRLayerCube.ALIGNOF),
            __member(OVRLayerQuad.SIZEOF, OVRLayerQuad.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADER = layout.offsetof(0);
        EYEFOV = layout.offsetof(1);
        EYEFOVDEPTH = layout.offsetof(2);
        MULTIRES = layout.offsetof(3);
        CYLINDER = layout.offsetof(4);
        CUBE = layout.offsetof(5);
        QUAD = layout.offsetof(6);
    }

    OVRLayerUnion(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRLayerUnion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRLayerUnion(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
    @NativeType("ovrLayerHeader")
    public OVRLayerHeader Header() { return nHeader(address()); }
    /** Returns a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
    @NativeType("ovrLayerEyeFov")
    public OVRLayerEyeFov EyeFov() { return nEyeFov(address()); }
    /** Returns a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
    @NativeType("ovrLayerEyeFovDepth")
    public OVRLayerEyeFovDepth EyeFovDepth() { return nEyeFovDepth(address()); }
    /** Returns a {@link OVRLayerEyeFovMultires} view of the {@code Multires} field. */
    @NativeType("ovrLayerEyeFovMultires")
    public OVRLayerEyeFovMultires Multires() { return nMultires(address()); }
    /** Returns a {@link OVRLayerCylinder} view of the {@code Cylinder} field. */
    @NativeType("ovrLayerCylinder")
    public OVRLayerCylinder Cylinder() { return nCylinder(address()); }
    /** Returns a {@link OVRLayerCube} view of the {@code Cube} field. */
    @NativeType("ovrLayerCube")
    public OVRLayerCube Cube() { return nCube(address()); }
    /** Returns a {@link OVRLayerQuad} view of the {@code Quad} field. */
    @NativeType("ovrLayerQuad")
    public OVRLayerQuad Quad() { return nQuad(address()); }

    /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
    public OVRLayerUnion Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { nHeader(address(), value); return this; }
    /** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
    public OVRLayerUnion EyeFov(@NativeType("ovrLayerEyeFov") OVRLayerEyeFov value) { nEyeFov(address(), value); return this; }
    /** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
    public OVRLayerUnion EyeFovDepth(@NativeType("ovrLayerEyeFovDepth") OVRLayerEyeFovDepth value) { nEyeFovDepth(address(), value); return this; }
    /** Copies the specified {@link OVRLayerEyeFovMultires} to the {@code Multires} field. */
    public OVRLayerUnion Multires(@NativeType("ovrLayerEyeFovMultires") OVRLayerEyeFovMultires value) { nMultires(address(), value); return this; }
    /** Copies the specified {@link OVRLayerCylinder} to the {@code Cylinder} field. */
    public OVRLayerUnion Cylinder(@NativeType("ovrLayerCylinder") OVRLayerCylinder value) { nCylinder(address(), value); return this; }
    /** Copies the specified {@link OVRLayerCube} to the {@code Cube} field. */
    public OVRLayerUnion Cube(@NativeType("ovrLayerCube") OVRLayerCube value) { nCube(address(), value); return this; }
    /** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
    public OVRLayerUnion Quad(@NativeType("ovrLayerQuad") OVRLayerQuad value) { nQuad(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRLayerUnion set(OVRLayerUnion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRLayerUnion malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRLayerUnion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRLayerUnion calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRLayerUnion} instance allocated with {@link BufferUtils}. */
    public static OVRLayerUnion create() {
        return new OVRLayerUnion(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRLayerUnion} instance for the specified memory address. */
    public static OVRLayerUnion create(long address) {
        return new OVRLayerUnion(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerUnion createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRLayerUnion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRLayerUnion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRLayerUnion} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRLayerUnion mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRLayerUnion} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRLayerUnion callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRLayerUnion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerUnion mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerUnion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRLayerUnion callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRLayerUnion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRLayerUnion.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Header}. */
    public static OVRLayerHeader nHeader(long struct) { return OVRLayerHeader.create(struct + OVRLayerUnion.HEADER); }
    /** Unsafe version of {@link #EyeFov}. */
    public static OVRLayerEyeFov nEyeFov(long struct) { return OVRLayerEyeFov.create(struct + OVRLayerUnion.EYEFOV); }
    /** Unsafe version of {@link #EyeFovDepth}. */
    public static OVRLayerEyeFovDepth nEyeFovDepth(long struct) { return OVRLayerEyeFovDepth.create(struct + OVRLayerUnion.EYEFOVDEPTH); }
    /** Unsafe version of {@link #Multires}. */
    public static OVRLayerEyeFovMultires nMultires(long struct) { return OVRLayerEyeFovMultires.create(struct + OVRLayerUnion.MULTIRES); }
    /** Unsafe version of {@link #Cylinder}. */
    public static OVRLayerCylinder nCylinder(long struct) { return OVRLayerCylinder.create(struct + OVRLayerUnion.CYLINDER); }
    /** Unsafe version of {@link #Cube}. */
    public static OVRLayerCube nCube(long struct) { return OVRLayerCube.create(struct + OVRLayerUnion.CUBE); }
    /** Unsafe version of {@link #Quad}. */
    public static OVRLayerQuad nQuad(long struct) { return OVRLayerQuad.create(struct + OVRLayerUnion.QUAD); }

    /** Unsafe version of {@link #Header(OVRLayerHeader) Header}. */
    public static void nHeader(long struct, OVRLayerHeader value) { memCopy(value.address(), struct + OVRLayerUnion.HEADER, OVRLayerHeader.SIZEOF); }
    /** Unsafe version of {@link #EyeFov(OVRLayerEyeFov) EyeFov}. */
    public static void nEyeFov(long struct, OVRLayerEyeFov value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOV, OVRLayerEyeFov.SIZEOF); }
    /** Unsafe version of {@link #EyeFovDepth(OVRLayerEyeFovDepth) EyeFovDepth}. */
    public static void nEyeFovDepth(long struct, OVRLayerEyeFovDepth value) { memCopy(value.address(), struct + OVRLayerUnion.EYEFOVDEPTH, OVRLayerEyeFovDepth.SIZEOF); }
    /** Unsafe version of {@link #Multires(OVRLayerEyeFovMultires) Multires}. */
    public static void nMultires(long struct, OVRLayerEyeFovMultires value) { memCopy(value.address(), struct + OVRLayerUnion.MULTIRES, OVRLayerEyeFovMultires.SIZEOF); }
    /** Unsafe version of {@link #Cylinder(OVRLayerCylinder) Cylinder}. */
    public static void nCylinder(long struct, OVRLayerCylinder value) { memCopy(value.address(), struct + OVRLayerUnion.CYLINDER, OVRLayerCylinder.SIZEOF); }
    /** Unsafe version of {@link #Cube(OVRLayerCube) Cube}. */
    public static void nCube(long struct, OVRLayerCube value) { memCopy(value.address(), struct + OVRLayerUnion.CUBE, OVRLayerCube.SIZEOF); }
    /** Unsafe version of {@link #Quad(OVRLayerQuad) Quad}. */
    public static void nQuad(long struct, OVRLayerQuad value) { memCopy(value.address(), struct + OVRLayerUnion.QUAD, OVRLayerQuad.SIZEOF); }

    // -----------------------------------

    /** An array of {@link OVRLayerUnion} structs. */
    public static class Buffer extends StructBuffer<OVRLayerUnion, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRLayerUnion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRLayerUnion#SIZEOF}, and its mark will be undefined.
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
        protected OVRLayerUnion newInstance(long address) {
            return new OVRLayerUnion(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRLayerHeader} view of the {@code Header} field. */
        @NativeType("ovrLayerHeader")
        public OVRLayerHeader Header() { return OVRLayerUnion.nHeader(address()); }
        /** Returns a {@link OVRLayerEyeFov} view of the {@code EyeFov} field. */
        @NativeType("ovrLayerEyeFov")
        public OVRLayerEyeFov EyeFov() { return OVRLayerUnion.nEyeFov(address()); }
        /** Returns a {@link OVRLayerEyeFovDepth} view of the {@code EyeFovDepth} field. */
        @NativeType("ovrLayerEyeFovDepth")
        public OVRLayerEyeFovDepth EyeFovDepth() { return OVRLayerUnion.nEyeFovDepth(address()); }
        /** Returns a {@link OVRLayerEyeFovMultires} view of the {@code Multires} field. */
        @NativeType("ovrLayerEyeFovMultires")
        public OVRLayerEyeFovMultires Multires() { return OVRLayerUnion.nMultires(address()); }
        /** Returns a {@link OVRLayerCylinder} view of the {@code Cylinder} field. */
        @NativeType("ovrLayerCylinder")
        public OVRLayerCylinder Cylinder() { return OVRLayerUnion.nCylinder(address()); }
        /** Returns a {@link OVRLayerCube} view of the {@code Cube} field. */
        @NativeType("ovrLayerCube")
        public OVRLayerCube Cube() { return OVRLayerUnion.nCube(address()); }
        /** Returns a {@link OVRLayerQuad} view of the {@code Quad} field. */
        @NativeType("ovrLayerQuad")
        public OVRLayerQuad Quad() { return OVRLayerUnion.nQuad(address()); }

        /** Copies the specified {@link OVRLayerHeader} to the {@code Header} field. */
        public OVRLayerUnion.Buffer Header(@NativeType("ovrLayerHeader") OVRLayerHeader value) { OVRLayerUnion.nHeader(address(), value); return this; }
        /** Copies the specified {@link OVRLayerEyeFov} to the {@code EyeFov} field. */
        public OVRLayerUnion.Buffer EyeFov(@NativeType("ovrLayerEyeFov") OVRLayerEyeFov value) { OVRLayerUnion.nEyeFov(address(), value); return this; }
        /** Copies the specified {@link OVRLayerEyeFovDepth} to the {@code EyeFovDepth} field. */
        public OVRLayerUnion.Buffer EyeFovDepth(@NativeType("ovrLayerEyeFovDepth") OVRLayerEyeFovDepth value) { OVRLayerUnion.nEyeFovDepth(address(), value); return this; }
        /** Copies the specified {@link OVRLayerEyeFovMultires} to the {@code Multires} field. */
        public OVRLayerUnion.Buffer Multires(@NativeType("ovrLayerEyeFovMultires") OVRLayerEyeFovMultires value) { OVRLayerUnion.nMultires(address(), value); return this; }
        /** Copies the specified {@link OVRLayerCylinder} to the {@code Cylinder} field. */
        public OVRLayerUnion.Buffer Cylinder(@NativeType("ovrLayerCylinder") OVRLayerCylinder value) { OVRLayerUnion.nCylinder(address(), value); return this; }
        /** Copies the specified {@link OVRLayerCube} to the {@code Cube} field. */
        public OVRLayerUnion.Buffer Cube(@NativeType("ovrLayerCube") OVRLayerCube value) { OVRLayerUnion.nCube(address(), value); return this; }
        /** Copies the specified {@link OVRLayerQuad} to the {@code Quad} field. */
        public OVRLayerUnion.Buffer Quad(@NativeType("ovrLayerQuad") OVRLayerQuad value) { OVRLayerUnion.nQuad(address(), value); return this; }

    }

}