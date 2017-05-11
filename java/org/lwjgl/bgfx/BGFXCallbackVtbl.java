/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Callback virtual table.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code fatal} &ndash; the fatal error callback</li>
 * <li>{@code trace_vargs} &ndash; the debug message callback</li>
 * <li>{@code cache_read_size} &ndash; the cache read size callback</li>
 * <li>{@code cache_read} &ndash; the cache read callback</li>
 * <li>{@code cache_write} &ndash; the cache write callback</li>
 * <li>{@code screen_shot} &ndash; the screenshot callback</li>
 * <li>{@code capture_begin} &ndash; the capture begin callback</li>
 * <li>{@code capture_end} &ndash; the capture end callback</li>
 * <li>{@code capture_frame} &ndash; the capture framecallback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_callback_vtbl_t {
    {@link BGFXFatalCallbackI fatal} fatal;
    {@link BGFXTraceVarArgsCallbackI trace_vargs} trace_vargs;
    {@link BGFXCacheReadSizeCallbackI cache_read_size} cache_read_size;
    {@link BGFXCacheReadCallbackI cache_read} cache_read;
    {@link BGFXCacheWriteCallbackI cache_write} cache_write;
    {@link BGFXScreenShotCallbackI screen_shot} screen_shot;
    {@link BGFXCaptureBeginCallbackI capture_begin} capture_begin;
    {@link BGFXCaptureEndCallbackI capture_end} capture_end;
    {@link BGFXCaptureFrameCallbackI capture_frame} capture_frame;
}</code></pre>
 */
public class BGFXCallbackVtbl extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FATAL,
        TRACE_VARGS,
        CACHE_READ_SIZE,
        CACHE_READ,
        CACHE_WRITE,
        SCREEN_SHOT,
        CAPTURE_BEGIN,
        CAPTURE_END,
        CAPTURE_FRAME;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FATAL = layout.offsetof(0);
        TRACE_VARGS = layout.offsetof(1);
        CACHE_READ_SIZE = layout.offsetof(2);
        CACHE_READ = layout.offsetof(3);
        CACHE_WRITE = layout.offsetof(4);
        SCREEN_SHOT = layout.offsetof(5);
        CAPTURE_BEGIN = layout.offsetof(6);
        CAPTURE_END = layout.offsetof(7);
        CAPTURE_FRAME = layout.offsetof(8);
    }

    BGFXCallbackVtbl(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXCallbackVtbl} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXCallbackVtbl(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code fatal} field. */
    public BGFXFatalCallback fatal() { return nfatal(address()); }
    /** Returns the value of the {@code trace_vargs} field. */
    public BGFXTraceVarArgsCallback trace_vargs() { return ntrace_vargs(address()); }
    /** Returns the value of the {@code cache_read_size} field. */
    public BGFXCacheReadSizeCallback cache_read_size() { return ncache_read_size(address()); }
    /** Returns the value of the {@code cache_read} field. */
    public BGFXCacheReadCallback cache_read() { return ncache_read(address()); }
    /** Returns the value of the {@code cache_write} field. */
    public BGFXCacheWriteCallback cache_write() { return ncache_write(address()); }
    /** Returns the value of the {@code screen_shot} field. */
    public BGFXScreenShotCallback screen_shot() { return nscreen_shot(address()); }
    /** Returns the value of the {@code capture_begin} field. */
    public BGFXCaptureBeginCallback capture_begin() { return ncapture_begin(address()); }
    /** Returns the value of the {@code capture_end} field. */
    public BGFXCaptureEndCallback capture_end() { return ncapture_end(address()); }
    /** Returns the value of the {@code capture_frame} field. */
    public BGFXCaptureFrameCallback capture_frame() { return ncapture_frame(address()); }

    /** Sets the specified value to the {@code fatal} field. */
    public BGFXCallbackVtbl fatal(BGFXFatalCallbackI value) { nfatal(address(), value); return this; }
    /** Sets the specified value to the {@code trace_vargs} field. */
    public BGFXCallbackVtbl trace_vargs(BGFXTraceVarArgsCallbackI value) { ntrace_vargs(address(), value); return this; }
    /** Sets the specified value to the {@code cache_read_size} field. */
    public BGFXCallbackVtbl cache_read_size(BGFXCacheReadSizeCallbackI value) { ncache_read_size(address(), value); return this; }
    /** Sets the specified value to the {@code cache_read} field. */
    public BGFXCallbackVtbl cache_read(BGFXCacheReadCallbackI value) { ncache_read(address(), value); return this; }
    /** Sets the specified value to the {@code cache_write} field. */
    public BGFXCallbackVtbl cache_write(BGFXCacheWriteCallbackI value) { ncache_write(address(), value); return this; }
    /** Sets the specified value to the {@code screen_shot} field. */
    public BGFXCallbackVtbl screen_shot(BGFXScreenShotCallbackI value) { nscreen_shot(address(), value); return this; }
    /** Sets the specified value to the {@code capture_begin} field. */
    public BGFXCallbackVtbl capture_begin(BGFXCaptureBeginCallbackI value) { ncapture_begin(address(), value); return this; }
    /** Sets the specified value to the {@code capture_end} field. */
    public BGFXCallbackVtbl capture_end(BGFXCaptureEndCallbackI value) { ncapture_end(address(), value); return this; }
    /** Sets the specified value to the {@code capture_frame} field. */
    public BGFXCallbackVtbl capture_frame(BGFXCaptureFrameCallbackI value) { ncapture_frame(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXCallbackVtbl set(
        BGFXFatalCallbackI fatal,
        BGFXTraceVarArgsCallbackI trace_vargs,
        BGFXCacheReadSizeCallbackI cache_read_size,
        BGFXCacheReadCallbackI cache_read,
        BGFXCacheWriteCallbackI cache_write,
        BGFXScreenShotCallbackI screen_shot,
        BGFXCaptureBeginCallbackI capture_begin,
        BGFXCaptureEndCallbackI capture_end,
        BGFXCaptureFrameCallbackI capture_frame
    ) {
        fatal(fatal);
        trace_vargs(trace_vargs);
        cache_read_size(cache_read_size);
        cache_read(cache_read);
        cache_write(cache_write);
        screen_shot(screen_shot);
        capture_begin(capture_begin);
        capture_end(capture_end);
        capture_frame(capture_frame);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXCallbackVtbl set(BGFXCallbackVtbl src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXCallbackVtbl} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXCallbackVtbl malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link BGFXCallbackVtbl} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXCallbackVtbl calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link BGFXCallbackVtbl} instance allocated with {@link BufferUtils}. */
    public static BGFXCallbackVtbl create() {
        return new BGFXCallbackVtbl(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXCallbackVtbl} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static BGFXCallbackVtbl create(long address) {
        return address == NULL ? null : new BGFXCallbackVtbl(address, null);
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link BGFXCallbackVtbl.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXCallbackVtbl} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXCallbackVtbl mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXCallbackVtbl} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXCallbackVtbl callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackVtbl mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXCallbackVtbl callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXCallbackVtbl.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fatal}. */
    public static BGFXFatalCallback nfatal(long struct) { return BGFXFatalCallback.create(memGetAddress(struct + BGFXCallbackVtbl.FATAL)); }
    /** Unsafe version of {@link #trace_vargs}. */
    public static BGFXTraceVarArgsCallback ntrace_vargs(long struct) { return BGFXTraceVarArgsCallback.create(memGetAddress(struct + BGFXCallbackVtbl.TRACE_VARGS)); }
    /** Unsafe version of {@link #cache_read_size}. */
    public static BGFXCacheReadSizeCallback ncache_read_size(long struct) { return BGFXCacheReadSizeCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE)); }
    /** Unsafe version of {@link #cache_read}. */
    public static BGFXCacheReadCallback ncache_read(long struct) { return BGFXCacheReadCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ)); }
    /** Unsafe version of {@link #cache_write}. */
    public static BGFXCacheWriteCallback ncache_write(long struct) { return BGFXCacheWriteCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CACHE_WRITE)); }
    /** Unsafe version of {@link #screen_shot}. */
    public static BGFXScreenShotCallback nscreen_shot(long struct) { return BGFXScreenShotCallback.create(memGetAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT)); }
    /** Unsafe version of {@link #capture_begin}. */
    public static BGFXCaptureBeginCallback ncapture_begin(long struct) { return BGFXCaptureBeginCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN)); }
    /** Unsafe version of {@link #capture_end}. */
    public static BGFXCaptureEndCallback ncapture_end(long struct) { return BGFXCaptureEndCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_END)); }
    /** Unsafe version of {@link #capture_frame}. */
    public static BGFXCaptureFrameCallback ncapture_frame(long struct) { return BGFXCaptureFrameCallback.create(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME)); }

    /** Unsafe version of {@link #fatal(BGFXFatalCallbackI) fatal}. */
    public static void nfatal(long struct, BGFXFatalCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.FATAL, value.address()); }
    /** Unsafe version of {@link #trace_vargs(BGFXTraceVarArgsCallbackI) trace_vargs}. */
    public static void ntrace_vargs(long struct, BGFXTraceVarArgsCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.TRACE_VARGS, value.address()); }
    /** Unsafe version of {@link #cache_read_size(BGFXCacheReadSizeCallbackI) cache_read_size}. */
    public static void ncache_read_size(long struct, BGFXCacheReadSizeCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE, value.address()); }
    /** Unsafe version of {@link #cache_read(BGFXCacheReadCallbackI) cache_read}. */
    public static void ncache_read(long struct, BGFXCacheReadCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_READ, value.address()); }
    /** Unsafe version of {@link #cache_write(BGFXCacheWriteCallbackI) cache_write}. */
    public static void ncache_write(long struct, BGFXCacheWriteCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CACHE_WRITE, value.address()); }
    /** Unsafe version of {@link #screen_shot(BGFXScreenShotCallbackI) screen_shot}. */
    public static void nscreen_shot(long struct, BGFXScreenShotCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT, value.address()); }
    /** Unsafe version of {@link #capture_begin(BGFXCaptureBeginCallbackI) capture_begin}. */
    public static void ncapture_begin(long struct, BGFXCaptureBeginCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN, value.address()); }
    /** Unsafe version of {@link #capture_end(BGFXCaptureEndCallbackI) capture_end}. */
    public static void ncapture_end(long struct, BGFXCaptureEndCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_END, value.address()); }
    /** Unsafe version of {@link #capture_frame(BGFXCaptureFrameCallbackI) capture_frame}. */
    public static void ncapture_frame(long struct, BGFXCaptureFrameCallbackI value) { memPutAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXCallbackVtbl.FATAL));
        check(memGetAddress(struct + BGFXCallbackVtbl.TRACE_VARGS));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ_SIZE));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_READ));
        check(memGetAddress(struct + BGFXCallbackVtbl.CACHE_WRITE));
        check(memGetAddress(struct + BGFXCallbackVtbl.SCREEN_SHOT));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_BEGIN));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_END));
        check(memGetAddress(struct + BGFXCallbackVtbl.CAPTURE_FRAME));
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

    /** An array of {@link BGFXCallbackVtbl} structs. */
    public static class Buffer extends StructBuffer<BGFXCallbackVtbl, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXCallbackVtbl.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXCallbackVtbl#SIZEOF}, and its mark will be undefined.
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
        protected BGFXCallbackVtbl newInstance(long address) {
            return new BGFXCallbackVtbl(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code fatal} field. */
        public BGFXFatalCallback fatal() { return BGFXCallbackVtbl.nfatal(address()); }
        /** Returns the value of the {@code trace_vargs} field. */
        public BGFXTraceVarArgsCallback trace_vargs() { return BGFXCallbackVtbl.ntrace_vargs(address()); }
        /** Returns the value of the {@code cache_read_size} field. */
        public BGFXCacheReadSizeCallback cache_read_size() { return BGFXCallbackVtbl.ncache_read_size(address()); }
        /** Returns the value of the {@code cache_read} field. */
        public BGFXCacheReadCallback cache_read() { return BGFXCallbackVtbl.ncache_read(address()); }
        /** Returns the value of the {@code cache_write} field. */
        public BGFXCacheWriteCallback cache_write() { return BGFXCallbackVtbl.ncache_write(address()); }
        /** Returns the value of the {@code screen_shot} field. */
        public BGFXScreenShotCallback screen_shot() { return BGFXCallbackVtbl.nscreen_shot(address()); }
        /** Returns the value of the {@code capture_begin} field. */
        public BGFXCaptureBeginCallback capture_begin() { return BGFXCallbackVtbl.ncapture_begin(address()); }
        /** Returns the value of the {@code capture_end} field. */
        public BGFXCaptureEndCallback capture_end() { return BGFXCallbackVtbl.ncapture_end(address()); }
        /** Returns the value of the {@code capture_frame} field. */
        public BGFXCaptureFrameCallback capture_frame() { return BGFXCallbackVtbl.ncapture_frame(address()); }

        /** Sets the specified value to the {@code fatal} field. */
        public BGFXCallbackVtbl.Buffer fatal(BGFXFatalCallbackI value) { BGFXCallbackVtbl.nfatal(address(), value); return this; }
        /** Sets the specified value to the {@code trace_vargs} field. */
        public BGFXCallbackVtbl.Buffer trace_vargs(BGFXTraceVarArgsCallbackI value) { BGFXCallbackVtbl.ntrace_vargs(address(), value); return this; }
        /** Sets the specified value to the {@code cache_read_size} field. */
        public BGFXCallbackVtbl.Buffer cache_read_size(BGFXCacheReadSizeCallbackI value) { BGFXCallbackVtbl.ncache_read_size(address(), value); return this; }
        /** Sets the specified value to the {@code cache_read} field. */
        public BGFXCallbackVtbl.Buffer cache_read(BGFXCacheReadCallbackI value) { BGFXCallbackVtbl.ncache_read(address(), value); return this; }
        /** Sets the specified value to the {@code cache_write} field. */
        public BGFXCallbackVtbl.Buffer cache_write(BGFXCacheWriteCallbackI value) { BGFXCallbackVtbl.ncache_write(address(), value); return this; }
        /** Sets the specified value to the {@code screen_shot} field. */
        public BGFXCallbackVtbl.Buffer screen_shot(BGFXScreenShotCallbackI value) { BGFXCallbackVtbl.nscreen_shot(address(), value); return this; }
        /** Sets the specified value to the {@code capture_begin} field. */
        public BGFXCallbackVtbl.Buffer capture_begin(BGFXCaptureBeginCallbackI value) { BGFXCallbackVtbl.ncapture_begin(address(), value); return this; }
        /** Sets the specified value to the {@code capture_end} field. */
        public BGFXCallbackVtbl.Buffer capture_end(BGFXCaptureEndCallbackI value) { BGFXCallbackVtbl.ncapture_end(address(), value); return this; }
        /** Sets the specified value to the {@code capture_frame} field. */
        public BGFXCallbackVtbl.Buffer capture_frame(BGFXCaptureFrameCallbackI value) { BGFXCallbackVtbl.ncapture_frame(address(), value); return this; }

    }

}