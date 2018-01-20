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
 * Structure describing variable pointers features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceVariablePointerFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2KHR}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceVariablePointerFeaturesKHR} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code variablePointers} is enabled then {@code variablePointersStorageBuffer} <b>must</b> also be enabled.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVariablePointers#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTER_FEATURES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code variablePointersStorageBuffer} &ndash; indicates whether the implementation supports the SPIR-V VariablePointersStorageBuffer capability. When this feature is not enabled, shader modules <b>must</b> not declare the SPV_KHR_variable_pointers extension or the VariablePointersStorageBuffer capability.</li>
 * <li>{@code variablePointers} &ndash; indicates whether the implementation supports the SPIR-V VariablePointers capability. When this feature is not enabled, shader modules <b>must</b> not declare the VariablePointers capability.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceVariablePointerFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 variablePointersStorageBuffer;
 *     VkBool32 variablePointers;
 * }</pre></code>
 */
public class VkPhysicalDeviceVariablePointerFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VARIABLEPOINTERSSTORAGEBUFFER,
        VARIABLEPOINTERS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(2);
        VARIABLEPOINTERS = layout.offsetof(3);
    }

    VkPhysicalDeviceVariablePointerFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceVariablePointerFeaturesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code variablePointersStorageBuffer} field. */
    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() { return nvariablePointersStorageBuffer(address()) != 0; }
    /** Returns the value of the {@code variablePointers} field. */
    @NativeType("VkBool32")
    public boolean variablePointers() { return nvariablePointers(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceVariablePointerFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceVariablePointerFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code variablePointers} field. */
    public VkPhysicalDeviceVariablePointerFeaturesKHR variablePointers(@NativeType("VkBool32") boolean value) { nvariablePointers(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceVariablePointerFeaturesKHR set(
        int sType,
        long pNext,
        boolean variablePointersStorageBuffer,
        boolean variablePointers
    ) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceVariablePointerFeaturesKHR set(VkPhysicalDeviceVariablePointerFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR create() {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR create(long address) {
        return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeaturesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #variablePointersStorageBuffer}. */
    public static int nvariablePointersStorageBuffer(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.VARIABLEPOINTERSSTORAGEBUFFER); }
    /** Unsafe version of {@link #variablePointers}. */
    public static int nvariablePointers(long struct) { return memGetInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.VARIABLEPOINTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #variablePointersStorageBuffer(boolean) variablePointersStorageBuffer}. */
    public static void nvariablePointersStorageBuffer(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.VARIABLEPOINTERSSTORAGEBUFFER, value); }
    /** Unsafe version of {@link #variablePointers(boolean) variablePointers}. */
    public static void nvariablePointers(long struct, int value) { memPutInt(struct + VkPhysicalDeviceVariablePointerFeaturesKHR.VARIABLEPOINTERS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceVariablePointerFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVariablePointerFeaturesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceVariablePointerFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceVariablePointerFeaturesKHR newInstance(long address) {
            return new VkPhysicalDeviceVariablePointerFeaturesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceVariablePointerFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceVariablePointerFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code variablePointersStorageBuffer} field. */
        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() { return VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointersStorageBuffer(address()) != 0; }
        /** Returns the value of the {@code variablePointers} field. */
        @NativeType("VkBool32")
        public boolean variablePointers() { return VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointers(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceVariablePointerFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code variablePointersStorageBuffer} field. */
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointersStorageBuffer(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code variablePointers} field. */
        public VkPhysicalDeviceVariablePointerFeaturesKHR.Buffer variablePointers(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceVariablePointerFeaturesKHR.nvariablePointers(address(), value ? 1 : 0); return this; }

    }

}