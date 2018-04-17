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
 * Structure specifying additional allocation parameters for descriptor sets.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code descriptorSetCount} is zero or this structure is not included in the {@code pNext} chain, then the variable lengths are considered to be zero. Otherwise, {@code pDescriptorCounts}[i] is the number of descriptors in the variable count descriptor binding in the corresponding descriptor set layout. If {@link VkDescriptorSetAllocateInfo}{@code ::pSetLayouts}[i] does not include a variable count descriptor binding, then {@code pDescriptorCounts}[i] is ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code descriptorSetCount} is not zero, {@code descriptorSetCount} <b>must</b> equal {@link VkDescriptorSetAllocateInfo}{@code ::descriptorSetCount}</li>
 * <li>If sVkDescriptorSetAllocateInfo{@code ::pSetLayouts}[i] has a variable descriptor count binding, then {@code pDescriptorCounts}[i] <b>must</b> be less than or equal to the descriptor count specified for that binding when the descriptor set layout was created.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorIndexing#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO_EXT}</li>
 * <li>If {@code descriptorSetCount} is not 0, {@code pDescriptorCounts} <b>must</b> be a valid pointer to an array of {@code descriptorSetCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code descriptorSetCount} &ndash; zero or the number of elements in {@code pDescriptorCounts}.</li>
 * <li>{@code pDescriptorCounts} &ndash; an array of descriptor counts, with each member specifying the number of descriptors in a variable descriptor count binding in the corresponding descriptor set being allocated.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkDescriptorSetVariableDescriptorCountAllocateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t descriptorSetCount;
 *     uint32_t const * pDescriptorCounts;
 * }</pre></code>
 */
public class VkDescriptorSetVariableDescriptorCountAllocateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DESCRIPTORSETCOUNT,
        PDESCRIPTORCOUNTS;

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
        DESCRIPTORSETCOUNT = layout.offsetof(2);
        PDESCRIPTORCOUNTS = layout.offsetof(3);
    }

    VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code descriptorSetCount} field. */
    @NativeType("uint32_t")
    public int descriptorSetCount() { return ndescriptorSetCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDescriptorCounts} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDescriptorCounts() { return npDescriptorCounts(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDescriptorCounts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(
        int sType,
        long pNext,
        @Nullable IntBuffer pDescriptorCounts
    ) {
        sType(sType);
        pNext(pNext);
        pDescriptorCounts(pDescriptorCounts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT set(VkDescriptorSetVariableDescriptorCountAllocateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create() {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance for the specified memory address. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT create(long address) {
        return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #descriptorSetCount}. */
    public static int ndescriptorSetCount(long struct) { return memGetInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.DESCRIPTORSETCOUNT); }
    /** Unsafe version of {@link #pDescriptorCounts() pDescriptorCounts}. */
    @Nullable public static IntBuffer npDescriptorCounts(long struct) { return memIntBufferSafe(memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.PDESCRIPTORCOUNTS), ndescriptorSetCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code descriptorSetCount} field of the specified {@code struct}. */
    public static void ndescriptorSetCount(long struct, int value) { memPutInt(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.DESCRIPTORSETCOUNT, value); }
    /** Unsafe version of {@link #pDescriptorCounts(IntBuffer) pDescriptorCounts}. */
    public static void npDescriptorCounts(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.PDESCRIPTORCOUNTS, memAddressSafe(value)); ndescriptorSetCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndescriptorSetCount(struct) != 0) {
            check(memGetAddress(struct + VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.PDESCRIPTORCOUNTS));
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

    /** An array of {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkDescriptorSetVariableDescriptorCountAllocateInfoEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDescriptorSetVariableDescriptorCountAllocateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkDescriptorSetVariableDescriptorCountAllocateInfoEXT newInstance(long address) {
            return new VkDescriptorSetVariableDescriptorCountAllocateInfoEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code descriptorSetCount} field. */
        @NativeType("uint32_t")
        public int descriptorSetCount() { return VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.ndescriptorSetCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDescriptorCounts} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDescriptorCounts() { return VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npDescriptorCounts(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDescriptorCounts} field. */
        public VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.Buffer pDescriptorCounts(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkDescriptorSetVariableDescriptorCountAllocateInfoEXT.npDescriptorCounts(address(), value); return this; }

    }

}