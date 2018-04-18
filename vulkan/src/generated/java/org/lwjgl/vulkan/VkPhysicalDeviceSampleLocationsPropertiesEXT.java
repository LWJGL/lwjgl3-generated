/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Structure describing sample location limits that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSampleLocations#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sampleLocationSampleCounts} &ndash; a bitmask of {@code VkSampleCountFlagBits} indicating the sample counts supporting custom sample locations.</li>
 * <li>{@code maxSampleLocationGridSize} &ndash; the maximum size of the pixel grid in which sample locations <b>can</b> vary that is supported for all sample counts in {@code sampleLocationSampleCounts}.</li>
 * <li>{@code sampleLocationCoordinateRange} &ndash; the range of supported sample location coordinates.</li>
 * <li>{@code sampleLocationSubPixelBits} &ndash; the number of bits of subpixel precision for sample locations.</li>
 * <li>{@code variableSampleLocations} &ndash; specifies whether the sample locations used by all pipelines that will be bound to a command buffer during a subpass <b>must</b> match. If set to {@link VK10#VK_TRUE TRUE}, the implementation supports variable sample locations in a subpass. If set to {@link VK10#VK_FALSE FALSE}, then the sample locations <b>must</b> stay constant in each subpass.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkSampleCountFlags sampleLocationSampleCounts;
 *     {@link VkExtent2D VkExtent2D} maxSampleLocationGridSize;
 *     float sampleLocationCoordinateRange[2];
 *     uint32_t sampleLocationSubPixelBits;
 *     VkBool32 variableSampleLocations;
 * }</pre></code>
 */
public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SAMPLELOCATIONSAMPLECOUNTS,
        MAXSAMPLELOCATIONGRIDSIZE,
        SAMPLELOCATIONCOORDINATERANGE,
        SAMPLELOCATIONSUBPIXELBITS,
        VARIABLESAMPLELOCATIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __array(4, 2),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSAMPLECOUNTS = layout.offsetof(2);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(3);
        SAMPLELOCATIONCOORDINATERANGE = layout.offsetof(4);
        SAMPLELOCATIONSUBPIXELBITS = layout.offsetof(5);
        VARIABLESAMPLELOCATIONS = layout.offsetof(6);
    }

    VkPhysicalDeviceSampleLocationsPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT(ByteBuffer container) {
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
    /** Returns the value of the {@code sampleLocationSampleCounts} field. */
    @NativeType("VkSampleCountFlags")
    public int sampleLocationSampleCounts() { return nsampleLocationSampleCounts(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code maxSampleLocationGridSize} field. */
    public VkExtent2D maxSampleLocationGridSize() { return nmaxSampleLocationGridSize(address()); }
    /** Returns a {@link FloatBuffer} view of the {@code sampleLocationCoordinateRange} field. */
    @NativeType("float[2]")
    public FloatBuffer sampleLocationCoordinateRange() { return nsampleLocationCoordinateRange(address()); }
    /** Returns the value at the specified index of the {@code sampleLocationCoordinateRange} field. */
    public float sampleLocationCoordinateRange(int index) { return nsampleLocationCoordinateRange(address(), index); }
    /** Returns the value of the {@code sampleLocationSubPixelBits} field. */
    @NativeType("uint32_t")
    public int sampleLocationSubPixelBits() { return nsampleLocationSubPixelBits(address()); }
    /** Returns the value of the {@code variableSampleLocations} field. */
    @NativeType("VkBool32")
    public boolean variableSampleLocations() { return nvariableSampleLocations(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSampleLocationsPropertiesEXT set(VkPhysicalDeviceSampleLocationsPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT create(long address) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #sampleLocationSampleCounts}. */
    public static int nsampleLocationSampleCounts(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSAMPLECOUNTS); }
    /** Unsafe version of {@link #maxSampleLocationGridSize}. */
    public static VkExtent2D nmaxSampleLocationGridSize(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.MAXSAMPLELOCATIONGRIDSIZE); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange}. */
    public static FloatBuffer nsampleLocationCoordinateRange(long struct) { return memFloatBuffer(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE, 2); }
    /** Unsafe version of {@link #sampleLocationCoordinateRange(int) sampleLocationCoordinateRange}. */
    public static float nsampleLocationCoordinateRange(long struct, int index) {
        return memGetFloat(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONCOORDINATERANGE + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #sampleLocationSubPixelBits}. */
    public static int nsampleLocationSubPixelBits(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.SAMPLELOCATIONSUBPIXELBITS); }
    /** Unsafe version of {@link #variableSampleLocations}. */
    public static int nvariableSampleLocations(long struct) { return memGetInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.VARIABLESAMPLELOCATIONS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSampleLocationsPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSampleLocationsPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSampleLocationsPropertiesEXT, Buffer> {

        /**
         * Creates a new {@link VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSampleLocationsPropertiesEXT newInstance(long address) {
            return new VkPhysicalDeviceSampleLocationsPropertiesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code sampleLocationSampleCounts} field. */
        @NativeType("VkSampleCountFlags")
        public int sampleLocationSampleCounts() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSampleCounts(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code maxSampleLocationGridSize} field. */
        public VkExtent2D maxSampleLocationGridSize() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nmaxSampleLocationGridSize(address()); }
        /** Returns a {@link FloatBuffer} view of the {@code sampleLocationCoordinateRange} field. */
        @NativeType("float[2]")
        public FloatBuffer sampleLocationCoordinateRange() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address()); }
        /** Returns the value at the specified index of the {@code sampleLocationCoordinateRange} field. */
        public float sampleLocationCoordinateRange(int index) { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationCoordinateRange(address(), index); }
        /** Returns the value of the {@code sampleLocationSubPixelBits} field. */
        @NativeType("uint32_t")
        public int sampleLocationSubPixelBits() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nsampleLocationSubPixelBits(address()); }
        /** Returns the value of the {@code variableSampleLocations} field. */
        @NativeType("VkBool32")
        public boolean variableSampleLocations() { return VkPhysicalDeviceSampleLocationsPropertiesEXT.nvariableSampleLocations(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSampleLocationsPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSampleLocationsPropertiesEXT.npNext(address(), value); return this; }

    }

}