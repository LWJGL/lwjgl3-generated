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
 * Structure specifying creation flags for descriptor set layout bindings.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code bindingCount} is zero or if this structure is not in the {@code pNext} chain, the {@code VkDescriptorBindingFlagsEXT} for each descriptor set layout binding is considered to be zero. Otherwise, the descriptor set layout binding at {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings}[i] uses the flags in {@code pBindingFlags}[i].</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code bindingCount} is not zero, {@code bindingCount} <b>must</b> equal {@link VkDescriptorSetLayoutCreateInfo}{@code ::bindingCount}</li>
 * <li>If {@link VkDescriptorSetLayoutCreateInfo}{@code ::flags} includes {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR}, then all elements of {@code pBindingFlags} <b>must</b> not include {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}, {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT}, or {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT}</li>
 * <li>If an element of {@code pBindingFlags} includes {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT}, then all other elements of {@link VkDescriptorSetLayoutCreateInfo}{@code ::pBindings} <b>must</b> have a smaller value of {@code binding}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingUniformBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingSampledImageUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, or {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingStorageImageUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingStorageBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingUniformTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingStorageTexelBufferUpdateAfterBind} is not enabled, all bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>All bindings with descriptor type {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC} <b>must</b> not use {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingUpdateUnusedWhilePending} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingPartiallyBound} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT}</li>
 * <li>If {@link VkPhysicalDeviceDescriptorIndexingFeaturesEXT}{@code ::descriptorBindingVariableDescriptorCount} is not enabled, all elements of {@code pBindingFlags} <b>must</b> not include {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT}</li>
 * <li>If an element of {@code pBindingFlags} includes {@link EXTDescriptorIndexing#VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT}, that element&#8217;s {@code descriptorType} <b>must</b> not be {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorIndexing#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO_EXT}</li>
 * <li>If {@code bindingCount} is not 0, {@code pBindingFlags} <b>must</b> be a valid pointer to an array of {@code bindingCount} valid combinations of {@code VkDescriptorBindingFlagBitsEXT} values</li>
 * <li>Each element of {@code pBindingFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code bindingCount} &ndash; zero or the number of elements in {@code pBindingFlags}.</li>
 * <li>{@code pBindingFlags} &ndash; a pointer to an array of {@code VkDescriptorBindingFlagsEXT} bitfields, one for each descriptor set layout binding.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorSetLayoutBindingFlagsCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t bindingCount;
 *     VkDescriptorBindingFlagsEXT const * pBindingFlags;
 * }</pre></code>
 */
public class VkDescriptorSetLayoutBindingFlagsCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BINDINGCOUNT,
        PBINDINGFLAGS;

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
        BINDINGCOUNT = layout.offsetof(2);
        PBINDINGFLAGS = layout.offsetof(3);
    }

    VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code bindingCount} field. */
    @NativeType("uint32_t")
    public int bindingCount() { return nbindingCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pBindingFlags} field. */
    @Nullable
    @NativeType("VkDescriptorBindingFlagsEXT const *")
    public IntBuffer pBindingFlags() { return npBindingFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlagsEXT const *") IntBuffer value) { npBindingFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pBindingFlags
    ) {
        sType(sType);
        pNext(pNext);
        pBindingFlags(pBindingFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT set(VkDescriptorSetLayoutBindingFlagsCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create() {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT create(long address) {
        return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #bindingCount}. */
    public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.BINDINGCOUNT); }
    /** Unsafe version of {@link #pBindingFlags() pBindingFlags}. */
    @Nullable public static IntBuffer npBindingFlags(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.PBINDINGFLAGS), nbindingCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code bindingCount} field of the specified {@code struct}. */
    public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.BINDINGCOUNT, value); }
    /** Unsafe version of {@link #pBindingFlags(IntBuffer) pBindingFlags}. */
    public static void npBindingFlags(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.PBINDINGFLAGS, memAddressSafe(value)); nbindingCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nbindingCount(struct) != 0) {
            check(memGetAddress(struct + VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.PBINDINGFLAGS));
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

    /** An array of {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetLayoutBindingFlagsCreateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetLayoutBindingFlagsCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetLayoutBindingFlagsCreateInfoEXT newInstance(long address) {
            return new VkDescriptorSetLayoutBindingFlagsCreateInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code bindingCount} field. */
        @NativeType("uint32_t")
        public int bindingCount() { return VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nbindingCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pBindingFlags} field. */
        @Nullable
        @NativeType("VkDescriptorBindingFlagsEXT const *")
        public IntBuffer pBindingFlags() { return VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npBindingFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pBindingFlags} field. */
        public VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.Buffer pBindingFlags(@Nullable @NativeType("VkDescriptorBindingFlagsEXT const *") IntBuffer value) { VkDescriptorSetLayoutBindingFlagsCreateInfoEXT.npBindingFlags(address(), value); return this; }

    }

}