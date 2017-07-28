/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created iOS surface object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pView} <b>must</b> be a valid {@code UIView} and <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link MVKIosSurface#VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pView} <b>must</b> be a pointer</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MVKIosSurface#vkCreateIOSSurfaceMVK CreateIOSSurfaceMVK}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code pView} &ndash; a reference to a {@code UIView} object which will display this surface. This {@code UIView} <b>must</b> be backed by a {@code CALayer} instance of type {@code CAMetalLayer}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkIOSSurfaceCreateInfoMVK {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkIOSSurfaceCreateFlagsMVK flags;
 *     const void * pView;
 * }</pre></code>
 */
public class VkIOSSurfaceCreateInfoMVK extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PVIEW;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PVIEW = layout.offsetof(3);
    }

    VkIOSSurfaceCreateInfoMVK(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkIOSSurfaceCreateInfoMVK} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIOSSurfaceCreateInfoMVK(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkIOSSurfaceCreateFlagsMVK")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code pView} field. */
    @NativeType("const void *")
    public long pView() { return npView(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIOSSurfaceCreateInfoMVK sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIOSSurfaceCreateInfoMVK pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkIOSSurfaceCreateInfoMVK flags(@NativeType("VkIOSSurfaceCreateFlagsMVK") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pView} field. */
    public VkIOSSurfaceCreateInfoMVK pView(@NativeType("const void *") long value) { npView(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIOSSurfaceCreateInfoMVK set(
        int sType,
        long pNext,
        int flags,
        long pView
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pView(pView);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIOSSurfaceCreateInfoMVK set(VkIOSSurfaceCreateInfoMVK src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIOSSurfaceCreateInfoMVK malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIOSSurfaceCreateInfoMVK calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated with {@link BufferUtils}. */
    public static VkIOSSurfaceCreateInfoMVK create() {
        return new VkIOSSurfaceCreateInfoMVK(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkIOSSurfaceCreateInfoMVK create(long address) {
        return address == NULL ? null : new VkIOSSurfaceCreateInfoMVK(address, null);
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkIOSSurfaceCreateInfoMVK mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkIOSSurfaceCreateInfoMVK callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIOSSurfaceCreateInfoMVK mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIOSSurfaceCreateInfoMVK callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIOSSurfaceCreateInfoMVK.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIOSSurfaceCreateInfoMVK.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkIOSSurfaceCreateInfoMVK.FLAGS); }
    /** Unsafe version of {@link #pView}. */
    public static long npView(long struct) { return memGetAddress(struct + VkIOSSurfaceCreateInfoMVK.PVIEW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIOSSurfaceCreateInfoMVK.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIOSSurfaceCreateInfoMVK.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkIOSSurfaceCreateInfoMVK.FLAGS, value); }
    /** Unsafe version of {@link #pView(long) pView}. */
    public static void npView(long struct, long value) { memPutAddress(struct + VkIOSSurfaceCreateInfoMVK.PVIEW, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIOSSurfaceCreateInfoMVK.PVIEW));
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

    /** An array of {@link VkIOSSurfaceCreateInfoMVK} structs. */
    public static class Buffer extends StructBuffer<VkIOSSurfaceCreateInfoMVK, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkIOSSurfaceCreateInfoMVK.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIOSSurfaceCreateInfoMVK#SIZEOF}, and its mark will be undefined.
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
        protected VkIOSSurfaceCreateInfoMVK newInstance(long address) {
            return new VkIOSSurfaceCreateInfoMVK(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIOSSurfaceCreateInfoMVK.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkIOSSurfaceCreateInfoMVK.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkIOSSurfaceCreateFlagsMVK")
        public int flags() { return VkIOSSurfaceCreateInfoMVK.nflags(address()); }
        /** Returns the value of the {@code pView} field. */
        @NativeType("const void *")
        public long pView() { return VkIOSSurfaceCreateInfoMVK.npView(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIOSSurfaceCreateInfoMVK.Buffer sType(@NativeType("VkStructureType") int value) { VkIOSSurfaceCreateInfoMVK.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIOSSurfaceCreateInfoMVK.Buffer pNext(@NativeType("const void *") long value) { VkIOSSurfaceCreateInfoMVK.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkIOSSurfaceCreateInfoMVK.Buffer flags(@NativeType("VkIOSSurfaceCreateFlagsMVK") int value) { VkIOSSurfaceCreateInfoMVK.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pView} field. */
        public VkIOSSurfaceCreateInfoMVK.Buffer pView(@NativeType("const void *") long value) { VkIOSSurfaceCreateInfoMVK.npView(address(), value); return this; }

    }

}