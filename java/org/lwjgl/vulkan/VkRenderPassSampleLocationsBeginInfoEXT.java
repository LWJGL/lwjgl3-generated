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
 * Structure specifying sample locations to use for the layout transition of custom sample locations compatible depth/stencil attachments.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code attachmentInitialSampleLocationsCount} is not 0, {@code pAttachmentInitialSampleLocations} <b>must</b> be a valid pointer to an array of {@code attachmentInitialSampleLocationsCount} valid {@link VkAttachmentSampleLocationsEXT} structures</li>
 * <li>If {@code postSubpassSampleLocationsCount} is not 0, {@code pPostSubpassSampleLocations} <b>must</b> be a valid pointer to an array of {@code postSubpassSampleLocationsCount} valid {@link VkSubpassSampleLocationsEXT} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAttachmentSampleLocationsEXT}, {@link VkSubpassSampleLocationsEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code attachmentInitialSampleLocationsCount} &ndash; the number of elements in the {@code pAttachmentInitialSampleLocations} array.</li>
 * <li>{@code pAttachmentInitialSampleLocations} &ndash; an array of {@code attachmentInitialSampleLocationsCount} {@link VkAttachmentSampleLocationsEXT} structures specifying the attachment indices and their corresponding sample location state. Each element of {@code pAttachmentInitialSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition a depth/stencil attachment from the initial layout of the attachment to the image layout specified for the attachment in the first subpass using it.</li>
 * <li>{@code postSubpassSampleLocationsCount} &ndash; the number of elements in the {@code pPostSubpassSampleLocations} array.</li>
 * <li>{@code pPostSubpassSampleLocations} &ndash; an array of {@code postSubpassSampleLocationsCount} {@link VkSubpassSampleLocationsEXT} structures specifying the subpass indices and their corresponding sample location state. Each element of {@code pPostSubpassSampleLocations} <b>can</b> specify the sample location state to use in the automatic layout transition performed to transition the depth/stencil attachment used by the specified subpass to the image layout specified in a dependent subpass or to the final layout of the attachment in case the specified subpass is the last subpass using that attachment. In addition, if {@link VkPhysicalDeviceSampleLocationsPropertiesEXT}{@code ::variableSampleLocations} is {@link VK10#VK_FALSE FALSE}, each element of {@code pPostSubpassSampleLocations} <b>must</b> specify the sample location state that matches the sample locations used by all pipelines that will be bound to a command buffer during the specified subpass. If {@code variableSampleLocations} is {@link VK10#VK_TRUE TRUE}, the sample locations used for rasterization do not depend on {@code pPostSubpassSampleLocations}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRenderPassSampleLocationsBeginInfoEXT {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t attachmentInitialSampleLocationsCount;
 *     const {@link VkAttachmentSampleLocationsEXT VkAttachmentSampleLocationsEXT} * pAttachmentInitialSampleLocations;
 *     uint32_t postSubpassSampleLocationsCount;
 *     const {@link VkSubpassSampleLocationsEXT VkSubpassSampleLocationsEXT} * pPostSubpassSampleLocations;
 * }</pre></code>
 */
public class VkRenderPassSampleLocationsBeginInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ATTACHMENTINITIALSAMPLELOCATIONSCOUNT,
        PATTACHMENTINITIALSAMPLELOCATIONS,
        POSTSUBPASSSAMPLELOCATIONSCOUNT,
        PPOSTSUBPASSSAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ATTACHMENTINITIALSAMPLELOCATIONSCOUNT = layout.offsetof(2);
        PATTACHMENTINITIALSAMPLELOCATIONS = layout.offsetof(3);
        POSTSUBPASSSAMPLELOCATIONSCOUNT = layout.offsetof(4);
        PPOSTSUBPASSSAMPLELOCATIONS = layout.offsetof(5);
    }

    VkRenderPassSampleLocationsBeginInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassSampleLocationsBeginInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassSampleLocationsBeginInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code attachmentInitialSampleLocationsCount} field. */
    @NativeType("uint32_t")
    public int attachmentInitialSampleLocationsCount() { return nattachmentInitialSampleLocationsCount(address()); }
    /** Returns a {@link VkAttachmentSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pAttachmentInitialSampleLocations} field. */
    @NativeType("const VkAttachmentSampleLocationsEXT *")
    public VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations() { return npAttachmentInitialSampleLocations(address()); }
    /** Returns the value of the {@code postSubpassSampleLocationsCount} field. */
    @NativeType("uint32_t")
    public int postSubpassSampleLocationsCount() { return npostSubpassSampleLocationsCount(address()); }
    /** Returns a {@link VkSubpassSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pPostSubpassSampleLocations} field. */
    @NativeType("const VkSubpassSampleLocationsEXT *")
    public VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations() { return npPostSubpassSampleLocations(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentSampleLocationsEXT.Buffer} to the {@code pAttachmentInitialSampleLocations} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pAttachmentInitialSampleLocations(@NativeType("const VkAttachmentSampleLocationsEXT *") VkAttachmentSampleLocationsEXT.Buffer value) { npAttachmentInitialSampleLocations(address(), value); return this; }
    /** Sets the address of the specified {@link VkSubpassSampleLocationsEXT.Buffer} to the {@code pPostSubpassSampleLocations} field. */
    public VkRenderPassSampleLocationsBeginInfoEXT pPostSubpassSampleLocations(@NativeType("const VkSubpassSampleLocationsEXT *") VkSubpassSampleLocationsEXT.Buffer value) { npPostSubpassSampleLocations(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassSampleLocationsBeginInfoEXT set(
        int sType,
        long pNext,
        VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations,
        VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations
    ) {
        sType(sType);
        pNext(pNext);
        pAttachmentInitialSampleLocations(pAttachmentInitialSampleLocations);
        pPostSubpassSampleLocations(pPostSubpassSampleLocations);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassSampleLocationsBeginInfoEXT set(VkRenderPassSampleLocationsBeginInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassSampleLocationsBeginInfoEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassSampleLocationsBeginInfoEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassSampleLocationsBeginInfoEXT create() {
        return new VkRenderPassSampleLocationsBeginInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkRenderPassSampleLocationsBeginInfoEXT create(long address) {
        return address == NULL ? null : new VkRenderPassSampleLocationsBeginInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassSampleLocationsBeginInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassSampleLocationsBeginInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSampleLocationsBeginInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PNEXT); }
    /** Unsafe version of {@link #attachmentInitialSampleLocationsCount}. */
    public static int nattachmentInitialSampleLocationsCount(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.ATTACHMENTINITIALSAMPLELOCATIONSCOUNT); }
    /** Unsafe version of {@link #pAttachmentInitialSampleLocations}. */
    public static VkAttachmentSampleLocationsEXT.Buffer npAttachmentInitialSampleLocations(long struct) { return VkAttachmentSampleLocationsEXT.create(memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS), nattachmentInitialSampleLocationsCount(struct)); }
    /** Unsafe version of {@link #postSubpassSampleLocationsCount}. */
    public static int npostSubpassSampleLocationsCount(long struct) { return memGetInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.POSTSUBPASSSAMPLELOCATIONSCOUNT); }
    /** Unsafe version of {@link #pPostSubpassSampleLocations}. */
    public static VkSubpassSampleLocationsEXT.Buffer npPostSubpassSampleLocations(long struct) { return VkSubpassSampleLocationsEXT.create(memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS), npostSubpassSampleLocationsCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code attachmentInitialSampleLocationsCount} field of the specified {@code struct}. */
    public static void nattachmentInitialSampleLocationsCount(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.ATTACHMENTINITIALSAMPLELOCATIONSCOUNT, value); }
    /** Unsafe version of {@link #pAttachmentInitialSampleLocations(VkAttachmentSampleLocationsEXT.Buffer) pAttachmentInitialSampleLocations}. */
    public static void npAttachmentInitialSampleLocations(long struct, VkAttachmentSampleLocationsEXT.Buffer value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS, memAddressSafe(value)); nattachmentInitialSampleLocationsCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code postSubpassSampleLocationsCount} field of the specified {@code struct}. */
    public static void npostSubpassSampleLocationsCount(long struct, int value) { memPutInt(struct + VkRenderPassSampleLocationsBeginInfoEXT.POSTSUBPASSSAMPLELOCATIONSCOUNT, value); }
    /** Unsafe version of {@link #pPostSubpassSampleLocations(VkSubpassSampleLocationsEXT.Buffer) pPostSubpassSampleLocations}. */
    public static void npPostSubpassSampleLocations(long struct, VkSubpassSampleLocationsEXT.Buffer value) { memPutAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS, memAddressSafe(value)); npostSubpassSampleLocationsCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int attachmentInitialSampleLocationsCount = nattachmentInitialSampleLocationsCount(struct);
        if (attachmentInitialSampleLocationsCount != 0) {
            long pAttachmentInitialSampleLocations = memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PATTACHMENTINITIALSAMPLELOCATIONS);
            check(pAttachmentInitialSampleLocations);
            VkAttachmentSampleLocationsEXT.validate(pAttachmentInitialSampleLocations, attachmentInitialSampleLocationsCount);
        }
        int postSubpassSampleLocationsCount = npostSubpassSampleLocationsCount(struct);
        if (postSubpassSampleLocationsCount != 0) {
            long pPostSubpassSampleLocations = memGetAddress(struct + VkRenderPassSampleLocationsBeginInfoEXT.PPOSTSUBPASSSAMPLELOCATIONS);
            check(pPostSubpassSampleLocations);
            VkSubpassSampleLocationsEXT.validate(pPostSubpassSampleLocations, postSubpassSampleLocationsCount);
        }
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

    /** An array of {@link VkRenderPassSampleLocationsBeginInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassSampleLocationsBeginInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassSampleLocationsBeginInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassSampleLocationsBeginInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassSampleLocationsBeginInfoEXT newInstance(long address) {
            return new VkRenderPassSampleLocationsBeginInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassSampleLocationsBeginInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkRenderPassSampleLocationsBeginInfoEXT.npNext(address()); }
        /** Returns the value of the {@code attachmentInitialSampleLocationsCount} field. */
        @NativeType("uint32_t")
        public int attachmentInitialSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.nattachmentInitialSampleLocationsCount(address()); }
        /** Returns a {@link VkAttachmentSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pAttachmentInitialSampleLocations} field. */
        @NativeType("const VkAttachmentSampleLocationsEXT *")
        public VkAttachmentSampleLocationsEXT.Buffer pAttachmentInitialSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address()); }
        /** Returns the value of the {@code postSubpassSampleLocationsCount} field. */
        @NativeType("uint32_t")
        public int postSubpassSampleLocationsCount() { return VkRenderPassSampleLocationsBeginInfoEXT.npostSubpassSampleLocationsCount(address()); }
        /** Returns a {@link VkSubpassSampleLocationsEXT.Buffer} view of the struct array pointed to by the {@code pPostSubpassSampleLocations} field. */
        @NativeType("const VkSubpassSampleLocationsEXT *")
        public VkSubpassSampleLocationsEXT.Buffer pPostSubpassSampleLocations() { return VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassSampleLocationsBeginInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pNext(@NativeType("const void *") long value) { VkRenderPassSampleLocationsBeginInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentSampleLocationsEXT.Buffer} to the {@code pAttachmentInitialSampleLocations} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pAttachmentInitialSampleLocations(@NativeType("const VkAttachmentSampleLocationsEXT *") VkAttachmentSampleLocationsEXT.Buffer value) { VkRenderPassSampleLocationsBeginInfoEXT.npAttachmentInitialSampleLocations(address(), value); return this; }
        /** Sets the address of the specified {@link VkSubpassSampleLocationsEXT.Buffer} to the {@code pPostSubpassSampleLocations} field. */
        public VkRenderPassSampleLocationsBeginInfoEXT.Buffer pPostSubpassSampleLocations(@NativeType("const VkSubpassSampleLocationsEXT *") VkSubpassSampleLocationsEXT.Buffer value) { VkRenderPassSampleLocationsBeginInfoEXT.npPostSubpassSampleLocations(address(), value); return this; }

    }

}