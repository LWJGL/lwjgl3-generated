/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing timing information about a previously-presented image.
 * 
 * <h5>Description</h5>
 * 
 * <p>The results for a given {@code swapchain} and {@code presentID} are only returned once from {@link GOOGLEDisplayTiming#vkGetPastPresentationTimingGOOGLE GetPastPresentationTimingGOOGLE}.</p>
 * 
 * <p>The application <b>can</b> use the fname:VkPastPresentationTimingGOOGLE values to occasionally adjust its timing. For example, if {@code actualPresentTime} is later than expected (e.g. one {@code refreshDuration} late), the application may increase its target IPD to a higher multiple of {@code refreshDuration} (e.g. decrease its frame rate from 60Hz to 30Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are consistently different, and if {@code presentMargin} is consistently large enough, the application may decrease its target IPD to a smaller multiple of {@code refreshDuration} (e.g. increase its frame rate from 30Hz to 60Hz). If {@code actualPresentTime} and {@code earliestPresentTime} are same, and if {@code presentMargin} is consistently high, the application may delay the start of its input-render-present loop in order to decrease the latency between user input and the corresponding present (always leaving some margin in case a new image takes longer to render than the previous image). An application that desires its target IPD to always be the same as {@code refreshDuration}, can also adjust features until {@code actualPresentTime} is never late and {@code presentMargin} is satisfactory.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link GOOGLEDisplayTiming#vkGetPastPresentationTimingGOOGLE GetPastPresentationTimingGOOGLE}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code presentID} &ndash; an application-provided value that was given to a previous {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command via {@code VkPresentTimeInfoGOOGLE}{@code ::presentID} (see below). It <b>can</b> be used to uniquely identify a previous present with the {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command.</li>
 * <li>{@code desiredPresentTime} &ndash; an application-provided value that was given to a previous {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command via {@code VkPresentTimeInfoGOOGLE}{@code ::desiredPresentTime}. If non-zero, it was used by the application to indicate that an image not be presented any sooner than {@code desiredPresentTime}.</li>
 * <li>{@code actualPresentTime} &ndash; the time when the image of the {@code swapchain} was actually displayed.</li>
 * <li>{@code earliestPresentTime} &ndash; the time when the image of the {@code swapchain} could have been displayed. This <b>may</b> differ from {@code actualPresentTime} if the application requested that the image be presented no sooner than {@code VkPresentTimeInfoGOOGLE}{@code ::desiredPresentTime}.</li>
 * <li>{@code presentMargin} &ndash; an indication of how early the {@link KHRSwapchain#vkQueuePresentKHR QueuePresentKHR} command was processed compared to how soon it needed to be processed, and still be presented at {@code earliestPresentTime}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPastPresentationTimingGOOGLE {
 *     uint32_t presentID;
 *     uint64_t desiredPresentTime;
 *     uint64_t actualPresentTime;
 *     uint64_t earliestPresentTime;
 *     uint64_t presentMargin;
 * }</pre></code>
 */
public class VkPastPresentationTimingGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PRESENTID,
        DESIREDPRESENTTIME,
        ACTUALPRESENTTIME,
        EARLIESTPRESENTTIME,
        PRESENTMARGIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
        ACTUALPRESENTTIME = layout.offsetof(2);
        EARLIESTPRESENTTIME = layout.offsetof(3);
        PRESENTMARGIN = layout.offsetof(4);
    }

    VkPastPresentationTimingGOOGLE(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPastPresentationTimingGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPastPresentationTimingGOOGLE(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code presentID} field. */
    @NativeType("uint32_t")
    public int presentID() { return npresentID(address()); }
    /** Returns the value of the {@code desiredPresentTime} field. */
    @NativeType("uint64_t")
    public long desiredPresentTime() { return ndesiredPresentTime(address()); }
    /** Returns the value of the {@code actualPresentTime} field. */
    @NativeType("uint64_t")
    public long actualPresentTime() { return nactualPresentTime(address()); }
    /** Returns the value of the {@code earliestPresentTime} field. */
    @NativeType("uint64_t")
    public long earliestPresentTime() { return nearliestPresentTime(address()); }
    /** Returns the value of the {@code presentMargin} field. */
    @NativeType("uint64_t")
    public long presentMargin() { return npresentMargin(address()); }

    /** Sets the specified value to the {@code presentID} field. */
    public VkPastPresentationTimingGOOGLE presentID(@NativeType("uint32_t") int value) { npresentID(address(), value); return this; }
    /** Sets the specified value to the {@code desiredPresentTime} field. */
    public VkPastPresentationTimingGOOGLE desiredPresentTime(@NativeType("uint64_t") long value) { ndesiredPresentTime(address(), value); return this; }
    /** Sets the specified value to the {@code actualPresentTime} field. */
    public VkPastPresentationTimingGOOGLE actualPresentTime(@NativeType("uint64_t") long value) { nactualPresentTime(address(), value); return this; }
    /** Sets the specified value to the {@code earliestPresentTime} field. */
    public VkPastPresentationTimingGOOGLE earliestPresentTime(@NativeType("uint64_t") long value) { nearliestPresentTime(address(), value); return this; }
    /** Sets the specified value to the {@code presentMargin} field. */
    public VkPastPresentationTimingGOOGLE presentMargin(@NativeType("uint64_t") long value) { npresentMargin(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPastPresentationTimingGOOGLE set(
        int presentID,
        long desiredPresentTime,
        long actualPresentTime,
        long earliestPresentTime,
        long presentMargin
    ) {
        presentID(presentID);
        desiredPresentTime(desiredPresentTime);
        actualPresentTime(actualPresentTime);
        earliestPresentTime(earliestPresentTime);
        presentMargin(presentMargin);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPastPresentationTimingGOOGLE set(VkPastPresentationTimingGOOGLE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPastPresentationTimingGOOGLE calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPastPresentationTimingGOOGLE create() {
        return new VkPastPresentationTimingGOOGLE(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPastPresentationTimingGOOGLE create(long address) {
        return address == NULL ? null : new VkPastPresentationTimingGOOGLE(address, null);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPastPresentationTimingGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPastPresentationTimingGOOGLE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPastPresentationTimingGOOGLE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPastPresentationTimingGOOGLE callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #presentID}. */
    public static int npresentID(long struct) { return memGetInt(struct + VkPastPresentationTimingGOOGLE.PRESENTID); }
    /** Unsafe version of {@link #desiredPresentTime}. */
    public static long ndesiredPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.DESIREDPRESENTTIME); }
    /** Unsafe version of {@link #actualPresentTime}. */
    public static long nactualPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.ACTUALPRESENTTIME); }
    /** Unsafe version of {@link #earliestPresentTime}. */
    public static long nearliestPresentTime(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.EARLIESTPRESENTTIME); }
    /** Unsafe version of {@link #presentMargin}. */
    public static long npresentMargin(long struct) { return memGetLong(struct + VkPastPresentationTimingGOOGLE.PRESENTMARGIN); }

    /** Unsafe version of {@link #presentID(int) presentID}. */
    public static void npresentID(long struct, int value) { memPutInt(struct + VkPastPresentationTimingGOOGLE.PRESENTID, value); }
    /** Unsafe version of {@link #desiredPresentTime(long) desiredPresentTime}. */
    public static void ndesiredPresentTime(long struct, long value) { memPutLong(struct + VkPastPresentationTimingGOOGLE.DESIREDPRESENTTIME, value); }
    /** Unsafe version of {@link #actualPresentTime(long) actualPresentTime}. */
    public static void nactualPresentTime(long struct, long value) { memPutLong(struct + VkPastPresentationTimingGOOGLE.ACTUALPRESENTTIME, value); }
    /** Unsafe version of {@link #earliestPresentTime(long) earliestPresentTime}. */
    public static void nearliestPresentTime(long struct, long value) { memPutLong(struct + VkPastPresentationTimingGOOGLE.EARLIESTPRESENTTIME, value); }
    /** Unsafe version of {@link #presentMargin(long) presentMargin}. */
    public static void npresentMargin(long struct, long value) { memPutLong(struct + VkPastPresentationTimingGOOGLE.PRESENTMARGIN, value); }

    // -----------------------------------

    /** An array of {@link VkPastPresentationTimingGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingGOOGLE, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPastPresentationTimingGOOGLE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPastPresentationTimingGOOGLE#SIZEOF}, and its mark will be undefined.
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
        protected VkPastPresentationTimingGOOGLE newInstance(long address) {
            return new VkPastPresentationTimingGOOGLE(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code presentID} field. */
        @NativeType("uint32_t")
        public int presentID() { return VkPastPresentationTimingGOOGLE.npresentID(address()); }
        /** Returns the value of the {@code desiredPresentTime} field. */
        @NativeType("uint64_t")
        public long desiredPresentTime() { return VkPastPresentationTimingGOOGLE.ndesiredPresentTime(address()); }
        /** Returns the value of the {@code actualPresentTime} field. */
        @NativeType("uint64_t")
        public long actualPresentTime() { return VkPastPresentationTimingGOOGLE.nactualPresentTime(address()); }
        /** Returns the value of the {@code earliestPresentTime} field. */
        @NativeType("uint64_t")
        public long earliestPresentTime() { return VkPastPresentationTimingGOOGLE.nearliestPresentTime(address()); }
        /** Returns the value of the {@code presentMargin} field. */
        @NativeType("uint64_t")
        public long presentMargin() { return VkPastPresentationTimingGOOGLE.npresentMargin(address()); }

        /** Sets the specified value to the {@code presentID} field. */
        public VkPastPresentationTimingGOOGLE.Buffer presentID(@NativeType("uint32_t") int value) { VkPastPresentationTimingGOOGLE.npresentID(address(), value); return this; }
        /** Sets the specified value to the {@code desiredPresentTime} field. */
        public VkPastPresentationTimingGOOGLE.Buffer desiredPresentTime(@NativeType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.ndesiredPresentTime(address(), value); return this; }
        /** Sets the specified value to the {@code actualPresentTime} field. */
        public VkPastPresentationTimingGOOGLE.Buffer actualPresentTime(@NativeType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.nactualPresentTime(address(), value); return this; }
        /** Sets the specified value to the {@code earliestPresentTime} field. */
        public VkPastPresentationTimingGOOGLE.Buffer earliestPresentTime(@NativeType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.nearliestPresentTime(address(), value); return this; }
        /** Sets the specified value to the {@code presentMargin} field. */
        public VkPastPresentationTimingGOOGLE.Buffer presentMargin(@NativeType("uint64_t") long value) { VkPastPresentationTimingGOOGLE.npresentMargin(address(), value); return this; }

    }

}