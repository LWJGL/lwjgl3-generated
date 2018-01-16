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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created descriptor update template.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code templateType} is {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR}, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
 * <li>If {@code templateType} is {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}, {@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code templateType} is {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>If {@code templateType} is {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}, {@code set} <b>must</b> be the unique set number in the pipeline layout that uses a descriptor set layout that was created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRDescriptorUpdateTemplate#VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code pDescriptorUpdateEntries} <b>must</b> be a valid pointer to an array of {@code descriptorUpdateEntryCount} valid {@link VkDescriptorUpdateTemplateEntryKHR} structures</li>
 * <li>{@code templateType} <b>must</b> be a valid {@code VkDescriptorUpdateTemplateTypeKHR} value</li>
 * <li>If {@code descriptorSetLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code descriptorSetLayout} <b>must</b> be a valid {@code VkDescriptorSetLayout} handle</li>
 * <li>If {@code pipelineBindPoint} is not 0, {@code pipelineBindPoint} <b>must</b> be a valid {@code VkPipelineBindPoint} value</li>
 * <li>If {@code pipelineLayout} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code descriptorUpdateEntryCount} <b>must</b> be greater than 0</li>
 * <li>Both of {@code descriptorSetLayout}, and {@code pipelineLayout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDescriptorUpdateTemplateEntryKHR}, {@link KHRDescriptorUpdateTemplate#vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code descriptorUpdateEntryCount} &ndash; the number of elements in the {@code pDescriptorUpdateEntries} array.</li>
 * <li>{@code pDescriptorUpdateEntries} &ndash; a pointer to an array of {@link VkDescriptorUpdateTemplateEntryKHR} structures describing the descriptors to be updated by the descriptor update template.</li>
 * <li>{@code templateType} &ndash; Specifies the type of the descriptor update template. If set to {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR} it <b>can</b> only be used to update descriptor sets with a fixed {@code descriptorSetLayout}. If set to {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR} it <b>can</b> only be used to push descriptor sets using the provided {@code pipelineBindPoint}, {@code pipelineLayout}, and {@code set} number.</li>
 * <li>{@code descriptorSetLayout} &ndash; the descriptor set layout the parameter update template will be used with. All descriptor sets which are going to be updated through the newly created descriptor update template <b>must</b> be created with this layout. {@code descriptorSetLayout} is the descriptor set layout used to build the descriptor update template. All descriptor sets which are going to be updated through the newly created descriptor update template <b>must</b> be created with a layout that matches (is the same as, or defined identically to) this layout. This parameter is ignored if {@code templateType} is not {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET_KHR}.</li>
 * <li>{@code pipelineBindPoint} &ndash; a {@code VkPipelineBindPoint} indicating whether the descriptors will be used by graphics pipelines or compute pipelines. This parameter is ignored if {@code templateType} is not {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}</li>
 * <li>{@code pipelineLayout} &ndash; a {@code VkPipelineLayout} object used to program the bindings. This parameter is ignored if {@code templateType} is not {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}</li>
 * <li>{@code set} &ndash; the set number of the descriptor set in the pipeline layout that will be updated. This parameter is ignored if {@code templateType} is not {@link KHRDescriptorUpdateTemplate#VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorUpdateTemplateCreateInfoKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDescriptorUpdateTemplateCreateFlagsKHR flags;
 *     uint32_t descriptorUpdateEntryCount;
 *     const {@link VkDescriptorUpdateTemplateEntryKHR VkDescriptorUpdateTemplateEntryKHR} * pDescriptorUpdateEntries;
 *     VkDescriptorUpdateTemplateTypeKHR templateType;
 *     VkDescriptorSetLayout descriptorSetLayout;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     VkPipelineLayout pipelineLayout;
 *     uint32_t set;
 * }</pre></code>
 */
public class VkDescriptorUpdateTemplateCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        DESCRIPTORUPDATEENTRYCOUNT,
        PDESCRIPTORUPDATEENTRIES,
        TEMPLATETYPE,
        DESCRIPTORSETLAYOUT,
        PIPELINEBINDPOINT,
        PIPELINELAYOUT,
        SET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DESCRIPTORUPDATEENTRYCOUNT = layout.offsetof(3);
        PDESCRIPTORUPDATEENTRIES = layout.offsetof(4);
        TEMPLATETYPE = layout.offsetof(5);
        DESCRIPTORSETLAYOUT = layout.offsetof(6);
        PIPELINEBINDPOINT = layout.offsetof(7);
        PIPELINELAYOUT = layout.offsetof(8);
        SET = layout.offsetof(9);
    }

    VkDescriptorUpdateTemplateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorUpdateTemplateCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkDescriptorUpdateTemplateCreateFlagsKHR")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code descriptorUpdateEntryCount} field. */
    @NativeType("uint32_t")
    public int descriptorUpdateEntryCount() { return ndescriptorUpdateEntryCount(address()); }
    /** Returns a {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} view of the struct array pointed to by the {@code pDescriptorUpdateEntries} field. */
    @NativeType("const VkDescriptorUpdateTemplateEntryKHR *")
    public VkDescriptorUpdateTemplateEntryKHR.Buffer pDescriptorUpdateEntries() { return npDescriptorUpdateEntries(address()); }
    /** Returns the value of the {@code templateType} field. */
    @NativeType("VkDescriptorUpdateTemplateTypeKHR")
    public int templateType() { return ntemplateType(address()); }
    /** Returns the value of the {@code descriptorSetLayout} field. */
    @NativeType("VkDescriptorSetLayout")
    public long descriptorSetLayout() { return ndescriptorSetLayout(address()); }
    /** Returns the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** Returns the value of the {@code pipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** Returns the value of the {@code set} field. */
    @NativeType("uint32_t")
    public int set() { return nset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR flags(@NativeType("VkDescriptorUpdateTemplateCreateFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} to the {@code pDescriptorUpdateEntries} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR pDescriptorUpdateEntries(@NativeType("const VkDescriptorUpdateTemplateEntryKHR *") VkDescriptorUpdateTemplateEntryKHR.Buffer value) { npDescriptorUpdateEntries(address(), value); return this; }
    /** Sets the specified value to the {@code templateType} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR templateType(@NativeType("VkDescriptorUpdateTemplateTypeKHR") int value) { ntemplateType(address(), value); return this; }
    /** Sets the specified value to the {@code descriptorSetLayout} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { ndescriptorSetLayout(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code set} field. */
    public VkDescriptorUpdateTemplateCreateInfoKHR set(@NativeType("uint32_t") int value) { nset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorUpdateTemplateCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        VkDescriptorUpdateTemplateEntryKHR.Buffer pDescriptorUpdateEntries,
        int templateType,
        long descriptorSetLayout,
        int pipelineBindPoint,
        long pipelineLayout,
        int set
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDescriptorUpdateEntries(pDescriptorUpdateEntries);
        templateType(templateType);
        descriptorSetLayout(descriptorSetLayout);
        pipelineBindPoint(pipelineBindPoint);
        pipelineLayout(pipelineLayout);
        set(set);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorUpdateTemplateCreateInfoKHR set(VkDescriptorUpdateTemplateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR create() {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance for the specified memory address. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR create(long address) {
        return new VkDescriptorUpdateTemplateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorUpdateTemplateCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorUpdateTemplateCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #descriptorUpdateEntryCount}. */
    public static int ndescriptorUpdateEntryCount(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.DESCRIPTORUPDATEENTRYCOUNT); }
    /** Unsafe version of {@link #pDescriptorUpdateEntries}. */
    public static VkDescriptorUpdateTemplateEntryKHR.Buffer npDescriptorUpdateEntries(long struct) { return VkDescriptorUpdateTemplateEntryKHR.create(memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PDESCRIPTORUPDATEENTRIES), ndescriptorUpdateEntryCount(struct)); }
    /** Unsafe version of {@link #templateType}. */
    public static int ntemplateType(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.TEMPLATETYPE); }
    /** Unsafe version of {@link #descriptorSetLayout}. */
    public static long ndescriptorSetLayout(long struct) { return memGetLong(struct + VkDescriptorUpdateTemplateCreateInfoKHR.DESCRIPTORSETLAYOUT); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return memGetLong(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PIPELINELAYOUT); }
    /** Unsafe version of {@link #set}. */
    public static int nset(long struct) { return memGetInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.SET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.FLAGS, value); }
    /** Sets the specified value to the {@code descriptorUpdateEntryCount} field of the specified {@code struct}. */
    public static void ndescriptorUpdateEntryCount(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.DESCRIPTORUPDATEENTRYCOUNT, value); }
    /** Unsafe version of {@link #pDescriptorUpdateEntries(VkDescriptorUpdateTemplateEntryKHR.Buffer) pDescriptorUpdateEntries}. */
    public static void npDescriptorUpdateEntries(long struct, VkDescriptorUpdateTemplateEntryKHR.Buffer value) { memPutAddress(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PDESCRIPTORUPDATEENTRIES, value.address()); ndescriptorUpdateEntryCount(struct, value.remaining()); }
    /** Unsafe version of {@link #templateType(int) templateType}. */
    public static void ntemplateType(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.TEMPLATETYPE, value); }
    /** Unsafe version of {@link #descriptorSetLayout(long) descriptorSetLayout}. */
    public static void ndescriptorSetLayout(long struct, long value) { memPutLong(struct + VkDescriptorUpdateTemplateCreateInfoKHR.DESCRIPTORSETLAYOUT, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PIPELINEBINDPOINT, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PIPELINELAYOUT, value); }
    /** Unsafe version of {@link #set(int) set}. */
    public static void nset(long struct, int value) { memPutInt(struct + VkDescriptorUpdateTemplateCreateInfoKHR.SET, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDescriptorUpdateTemplateCreateInfoKHR.PDESCRIPTORUPDATEENTRIES));
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

    /** An array of {@link VkDescriptorUpdateTemplateCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorUpdateTemplateCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDescriptorUpdateTemplateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorUpdateTemplateCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorUpdateTemplateCreateInfoKHR newInstance(long address) {
            return new VkDescriptorUpdateTemplateCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorUpdateTemplateCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDescriptorUpdateTemplateCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkDescriptorUpdateTemplateCreateFlagsKHR")
        public int flags() { return VkDescriptorUpdateTemplateCreateInfoKHR.nflags(address()); }
        /** Returns the value of the {@code descriptorUpdateEntryCount} field. */
        @NativeType("uint32_t")
        public int descriptorUpdateEntryCount() { return VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorUpdateEntryCount(address()); }
        /** Returns a {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} view of the struct array pointed to by the {@code pDescriptorUpdateEntries} field. */
        @NativeType("const VkDescriptorUpdateTemplateEntryKHR *")
        public VkDescriptorUpdateTemplateEntryKHR.Buffer pDescriptorUpdateEntries() { return VkDescriptorUpdateTemplateCreateInfoKHR.npDescriptorUpdateEntries(address()); }
        /** Returns the value of the {@code templateType} field. */
        @NativeType("VkDescriptorUpdateTemplateTypeKHR")
        public int templateType() { return VkDescriptorUpdateTemplateCreateInfoKHR.ntemplateType(address()); }
        /** Returns the value of the {@code descriptorSetLayout} field. */
        @NativeType("VkDescriptorSetLayout")
        public long descriptorSetLayout() { return VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorSetLayout(address()); }
        /** Returns the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkDescriptorUpdateTemplateCreateInfoKHR.npipelineBindPoint(address()); }
        /** Returns the value of the {@code pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkDescriptorUpdateTemplateCreateInfoKHR.npipelineLayout(address()); }
        /** Returns the value of the {@code set} field. */
        @NativeType("uint32_t")
        public int set() { return VkDescriptorUpdateTemplateCreateInfoKHR.nset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pNext(@NativeType("void *") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer flags(@NativeType("VkDescriptorUpdateTemplateCreateFlagsKHR") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link VkDescriptorUpdateTemplateEntryKHR.Buffer} to the {@code pDescriptorUpdateEntries} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pDescriptorUpdateEntries(@NativeType("const VkDescriptorUpdateTemplateEntryKHR *") VkDescriptorUpdateTemplateEntryKHR.Buffer value) { VkDescriptorUpdateTemplateCreateInfoKHR.npDescriptorUpdateEntries(address(), value); return this; }
        /** Sets the specified value to the {@code templateType} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer templateType(@NativeType("VkDescriptorUpdateTemplateTypeKHR") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.ntemplateType(address(), value); return this; }
        /** Sets the specified value to the {@code descriptorSetLayout} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer descriptorSetLayout(@NativeType("VkDescriptorSetLayout") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.ndescriptorSetLayout(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.npipelineBindPoint(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkDescriptorUpdateTemplateCreateInfoKHR.npipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code set} field. */
        public VkDescriptorUpdateTemplateCreateInfoKHR.Buffer set(@NativeType("uint32_t") int value) { VkDescriptorUpdateTemplateCreateInfoKHR.nset(address(), value); return this; }

    }

}