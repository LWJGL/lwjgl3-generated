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
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDevice16BitStorageFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 storageBuffer16BitAccess;
 *     VkBool32 uniformAndStorageBuffer16BitAccess;
 *     VkBool32 storagePushConstant16;
 *     VkBool32 storageInputOutput16;
 * }</pre></code>
 */
public class VkPhysicalDevice16BitStorageFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        STORAGEBUFFER16BITACCESS,
        UNIFORMANDSTORAGEBUFFER16BITACCESS,
        STORAGEPUSHCONSTANT16,
        STORAGEINPUTOUTPUT16;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
    }

    VkPhysicalDevice16BitStorageFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevice16BitStorageFeaturesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code storageBuffer16BitAccess} field. */
    @NativeType("VkBool32")
    public boolean storageBuffer16BitAccess() { return nstorageBuffer16BitAccess(address()) != 0; }
    /** Returns the value of the {@code uniformAndStorageBuffer16BitAccess} field. */
    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() { return nuniformAndStorageBuffer16BitAccess(address()) != 0; }
    /** Returns the value of the {@code storagePushConstant16} field. */
    @NativeType("VkBool32")
    public boolean storagePushConstant16() { return nstoragePushConstant16(address()) != 0; }
    /** Returns the value of the {@code storageInputOutput16} field. */
    @NativeType("VkBool32")
    public boolean storageInputOutput16() { return nstorageInputOutput16(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code storageBuffer16BitAccess} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code uniformAndStorageBuffer16BitAccess} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storagePushConstant16} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR storagePushConstant16(@NativeType("VkBool32") boolean value) { nstoragePushConstant16(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code storageInputOutput16} field. */
    public VkPhysicalDevice16BitStorageFeaturesKHR storageInputOutput16(@NativeType("VkBool32") boolean value) { nstorageInputOutput16(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevice16BitStorageFeaturesKHR set(
        int sType,
        long pNext,
        boolean storageBuffer16BitAccess,
        boolean uniformAndStorageBuffer16BitAccess,
        boolean storagePushConstant16,
        boolean storageInputOutput16
    ) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevice16BitStorageFeaturesKHR set(VkPhysicalDevice16BitStorageFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR create() {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR create(long address) {
        return new VkPhysicalDevice16BitStorageFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice16BitStorageFeaturesKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDevice16BitStorageFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevice16BitStorageFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevice16BitStorageFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #storageBuffer16BitAccess}. */
    public static int nstorageBuffer16BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess}. */
    public static int nuniformAndStorageBuffer16BitAccess(long struct) { return memGetInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.UNIFORMANDSTORAGEBUFFER16BITACCESS); }
    /** Unsafe version of {@link #storagePushConstant16}. */
    public static int nstoragePushConstant16(long struct) { return memGetInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEPUSHCONSTANT16); }
    /** Unsafe version of {@link #storageInputOutput16}. */
    public static int nstorageInputOutput16(long struct) { return memGetInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEINPUTOUTPUT16); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevice16BitStorageFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #storageBuffer16BitAccess(boolean) storageBuffer16BitAccess}. */
    public static void nstorageBuffer16BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #uniformAndStorageBuffer16BitAccess(boolean) uniformAndStorageBuffer16BitAccess}. */
    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) { memPutInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.UNIFORMANDSTORAGEBUFFER16BITACCESS, value); }
    /** Unsafe version of {@link #storagePushConstant16(boolean) storagePushConstant16}. */
    public static void nstoragePushConstant16(long struct, int value) { memPutInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEPUSHCONSTANT16, value); }
    /** Unsafe version of {@link #storageInputOutput16(boolean) storageInputOutput16}. */
    public static void nstorageInputOutput16(long struct, int value) { memPutInt(struct + VkPhysicalDevice16BitStorageFeaturesKHR.STORAGEINPUTOUTPUT16, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevice16BitStorageFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevice16BitStorageFeaturesKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDevice16BitStorageFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevice16BitStorageFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevice16BitStorageFeaturesKHR newInstance(long address) {
            return new VkPhysicalDevice16BitStorageFeaturesKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevice16BitStorageFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevice16BitStorageFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code storageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeaturesKHR.nstorageBuffer16BitAccess(address()) != 0; }
        /** Returns the value of the {@code uniformAndStorageBuffer16BitAccess} field. */
        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() { return VkPhysicalDevice16BitStorageFeaturesKHR.nuniformAndStorageBuffer16BitAccess(address()) != 0; }
        /** Returns the value of the {@code storagePushConstant16} field. */
        @NativeType("VkBool32")
        public boolean storagePushConstant16() { return VkPhysicalDevice16BitStorageFeaturesKHR.nstoragePushConstant16(address()) != 0; }
        /** Returns the value of the {@code storageInputOutput16} field. */
        @NativeType("VkBool32")
        public boolean storageInputOutput16() { return VkPhysicalDevice16BitStorageFeaturesKHR.nstorageInputOutput16(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevice16BitStorageFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevice16BitStorageFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code storageBuffer16BitAccess} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeaturesKHR.nstorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code uniformAndStorageBuffer16BitAccess} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeaturesKHR.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storagePushConstant16} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeaturesKHR.nstoragePushConstant16(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code storageInputOutput16} field. */
        public VkPhysicalDevice16BitStorageFeaturesKHR.Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) { VkPhysicalDevice16BitStorageFeaturesKHR.nstorageInputOutput16(address(), value ? 1 : 0); return this; }

    }

}