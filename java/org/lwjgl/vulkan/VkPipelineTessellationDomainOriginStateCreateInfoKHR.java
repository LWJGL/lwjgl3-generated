/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the orientation of the tessellation domain.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} structure is included in the {@code pNext} chain of {@link VkPipelineTessellationStateCreateInfo}, it controls the origin of the tessellation domain. If this structure is not present, it is as if {@code domainOrigin} were {@link KHRMaintenance2#VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRMaintenance2#VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_TESSELLATION_DOMAIN_ORIGIN_STATE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code domainOrigin} <b>must</b> be a valid {@code VkTessellationDomainOriginKHR} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code domainOrigin} &ndash; controls the origin of the tessellation domain space, and is of type {@code VkTessellationDomainOriginKHR}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineTessellationDomainOriginStateCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkTessellationDomainOriginKHR domainOrigin;
 * }</pre></code>
 */
public class VkPipelineTessellationDomainOriginStateCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DOMAINORIGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DOMAINORIGIN = layout.offsetof(2);
    }

    VkPipelineTessellationDomainOriginStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code domainOrigin} field. */
    @NativeType("VkTessellationDomainOriginKHR")
    public int domainOrigin() { return ndomainOrigin(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code domainOrigin} field. */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR domainOrigin(@NativeType("VkTessellationDomainOriginKHR") int value) { ndomainOrigin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR set(
        int sType,
        long pNext,
        int domainOrigin
    ) {
        sType(sType);
        pNext(pNext);
        domainOrigin(domainOrigin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineTessellationDomainOriginStateCreateInfoKHR set(VkPipelineTessellationDomainOriginStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR create() {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR create(long address) {
        return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #domainOrigin}. */
    public static int ndomainOrigin(long struct) { return memGetInt(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.DOMAINORIGIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #domainOrigin(int) domainOrigin}. */
    public static void ndomainOrigin(long struct, int value) { memPutInt(struct + VkPipelineTessellationDomainOriginStateCreateInfoKHR.DOMAINORIGIN, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineTessellationDomainOriginStateCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineTessellationDomainOriginStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineTessellationDomainOriginStateCreateInfoKHR newInstance(long address) {
            return new VkPipelineTessellationDomainOriginStateCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineTessellationDomainOriginStateCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkPipelineTessellationDomainOriginStateCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code domainOrigin} field. */
        @NativeType("VkTessellationDomainOriginKHR")
        public int domainOrigin() { return VkPipelineTessellationDomainOriginStateCreateInfoKHR.ndomainOrigin(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineTessellationDomainOriginStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkPipelineTessellationDomainOriginStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code domainOrigin} field. */
        public VkPipelineTessellationDomainOriginStateCreateInfoKHR.Buffer domainOrigin(@NativeType("VkTessellationDomainOriginKHR") int value) { VkPipelineTessellationDomainOriginStateCreateInfoKHR.ndomainOrigin(address(), value); return this; }

    }

}