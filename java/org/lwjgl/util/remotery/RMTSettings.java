/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure to fill in to modify Remotery default settings.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code port} &ndash; which port to listen for incoming connections on</li>
 * <li>{@code limit_connections_to_localhost} &ndash; 
 * Only allow connections on localhost?
 * 
 * <p>For dev builds you may want to access your game from other devices but if you distribute a game to your players with Remotery active, probably best to
 * limit connections to localhost.</p></li>
 * <li>{@code msSleepBetweenServerUpdates} &ndash; how long to sleep between server updates, hopefully trying to give a little CPU back to other threads</li>
 * <li>{@code messageQueueSizeInBytes} &ndash; size of the internal message queues Remotery uses. Will be rounded to page granularity of 64k.</li>
 * <li>{@code maxNbMessagesPerUpdate} &ndash; 
 * if the user continuously pushes to the message queue, the server network code won't get a chance to update unless there's an upper-limit on how many
 * messages can be consumed per loop</li>
 * <li>{@code _malloc} &ndash; callback pointer for memory allocation</li>
 * <li>{@code realloc} &ndash; callback pointer for memory allocation</li>
 * <li>{@code _free} &ndash; callback pointer for memory allocation</li>
 * <li>{@code mm_context} &ndash; memory allocation context pointer</li>
 * <li>{@code input_handler} &ndash; callback pointer for receiving input from the Remotery console</li>
 * <li>{@code input_handler_context} &ndash; context pointer that gets sent to Remotery console callback function</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct rmtSettings {
 *     rmtU16 port;
 *     rmtBool limit_connections_to_localhost;
 *     rmtU32 msSleepBetweenServerUpdates;
 *     rmtU32 messageQueueSizeInBytes;
 *     rmtU32 maxNbMessagesPerUpdate;
 *     {@link RMTMallocI rmtMalloc} _malloc;
 *     {@link RMTReallocI rmtRealloc} realloc;
 *     {@link RMTFreeI rmtFreePtr} _free;
 *     void * mm_context;
 *     {@link RMTInputHandlerI rmtInputHandlerPtr} input_handler;
 *     void * input_handler_context;
 *     rmtPStr logFilename;
 * }</pre></code>
 */
@NativeType("struct rmtSettings")
public class RMTSettings extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PORT,
        LIMIT_CONNECTIONS_TO_LOCALHOST,
        MSSLEEPBETWEENSERVERUPDATES,
        MESSAGEQUEUESIZEINBYTES,
        MAXNBMESSAGESPERUPDATE,
        _MALLOC,
        REALLOC,
        _FREE,
        MM_CONTEXT,
        INPUT_HANDLER,
        INPUT_HANDLER_CONTEXT,
        LOGFILENAME;

    static {
        Layout layout = __struct(
            __member(2),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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

        PORT = layout.offsetof(0);
        LIMIT_CONNECTIONS_TO_LOCALHOST = layout.offsetof(1);
        MSSLEEPBETWEENSERVERUPDATES = layout.offsetof(2);
        MESSAGEQUEUESIZEINBYTES = layout.offsetof(3);
        MAXNBMESSAGESPERUPDATE = layout.offsetof(4);
        _MALLOC = layout.offsetof(5);
        REALLOC = layout.offsetof(6);
        _FREE = layout.offsetof(7);
        MM_CONTEXT = layout.offsetof(8);
        INPUT_HANDLER = layout.offsetof(9);
        INPUT_HANDLER_CONTEXT = layout.offsetof(10);
        LOGFILENAME = layout.offsetof(11);
    }

    RMTSettings(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link RMTSettings} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTSettings(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code port} field. */
    @NativeType("rmtU16")
    public short port() { return nport(address()); }
    /** Returns the value of the {@code limit_connections_to_localhost} field. */
    @NativeType("rmtBool")
    public int limit_connections_to_localhost() { return nlimit_connections_to_localhost(address()); }
    /** Returns the value of the {@code msSleepBetweenServerUpdates} field. */
    @NativeType("rmtU32")
    public int msSleepBetweenServerUpdates() { return nmsSleepBetweenServerUpdates(address()); }
    /** Returns the value of the {@code messageQueueSizeInBytes} field. */
    @NativeType("rmtU32")
    public int messageQueueSizeInBytes() { return nmessageQueueSizeInBytes(address()); }
    /** Returns the value of the {@code maxNbMessagesPerUpdate} field. */
    @NativeType("rmtU32")
    public int maxNbMessagesPerUpdate() { return nmaxNbMessagesPerUpdate(address()); }
    /** Returns the value of the {@code _malloc} field. */
    @NativeType("rmtMalloc")
    public RMTMalloc _malloc() { return n_malloc(address()); }
    /** Returns the value of the {@code realloc} field. */
    @NativeType("rmtRealloc")
    public RMTRealloc realloc() { return nrealloc(address()); }
    /** Returns the value of the {@code _free} field. */
    @NativeType("rmtFreePtr")
    public RMTFree _free() { return n_free(address()); }
    /** Returns the value of the {@code mm_context} field. */
    @NativeType("void *")
    public long mm_context() { return nmm_context(address()); }
    /** Returns the value of the {@code input_handler} field. */
    @NativeType("rmtInputHandlerPtr")
    public RMTInputHandler input_handler() { return ninput_handler(address()); }
    /** Returns the value of the {@code input_handler_context} field. */
    @NativeType("void *")
    public long input_handler_context() { return ninput_handler_context(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code logFilename} field. */
    @NativeType("rmtPStr")
    public ByteBuffer logFilename() { return nlogFilename(address()); }
    /** Decodes the null-terminated string pointed to by the {@code logFilename} field. */
    @NativeType("rmtPStr")
    public String logFilenameString() { return nlogFilenameString(address()); }

    /** Sets the specified value to the {@code port} field. */
    public RMTSettings port(@NativeType("rmtU16") short value) { nport(address(), value); return this; }
    /** Sets the specified value to the {@code limit_connections_to_localhost} field. */
    public RMTSettings limit_connections_to_localhost(@NativeType("rmtBool") int value) { nlimit_connections_to_localhost(address(), value); return this; }
    /** Sets the specified value to the {@code msSleepBetweenServerUpdates} field. */
    public RMTSettings msSleepBetweenServerUpdates(@NativeType("rmtU32") int value) { nmsSleepBetweenServerUpdates(address(), value); return this; }
    /** Sets the specified value to the {@code messageQueueSizeInBytes} field. */
    public RMTSettings messageQueueSizeInBytes(@NativeType("rmtU32") int value) { nmessageQueueSizeInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code maxNbMessagesPerUpdate} field. */
    public RMTSettings maxNbMessagesPerUpdate(@NativeType("rmtU32") int value) { nmaxNbMessagesPerUpdate(address(), value); return this; }
    /** Sets the specified value to the {@code _malloc} field. */
    public RMTSettings _malloc(@NativeType("rmtMalloc") RMTMallocI value) { n_malloc(address(), value); return this; }
    /** Sets the specified value to the {@code realloc} field. */
    public RMTSettings realloc(@NativeType("rmtRealloc") RMTReallocI value) { nrealloc(address(), value); return this; }
    /** Sets the specified value to the {@code _free} field. */
    public RMTSettings _free(@NativeType("rmtFreePtr") RMTFreeI value) { n_free(address(), value); return this; }
    /** Sets the specified value to the {@code mm_context} field. */
    public RMTSettings mm_context(@NativeType("void *") long value) { nmm_context(address(), value); return this; }
    /** Sets the specified value to the {@code input_handler} field. */
    public RMTSettings input_handler(@NativeType("rmtInputHandlerPtr") RMTInputHandlerI value) { ninput_handler(address(), value); return this; }
    /** Sets the specified value to the {@code input_handler_context} field. */
    public RMTSettings input_handler_context(@NativeType("void *") long value) { ninput_handler_context(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code logFilename} field. */
    public RMTSettings logFilename(@NativeType("rmtPStr") ByteBuffer value) { nlogFilename(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public RMTSettings set(
        short port,
        int limit_connections_to_localhost,
        int msSleepBetweenServerUpdates,
        int messageQueueSizeInBytes,
        int maxNbMessagesPerUpdate,
        RMTMallocI _malloc,
        RMTReallocI realloc,
        RMTFreeI _free,
        long mm_context,
        RMTInputHandlerI input_handler,
        long input_handler_context,
        ByteBuffer logFilename
    ) {
        port(port);
        limit_connections_to_localhost(limit_connections_to_localhost);
        msSleepBetweenServerUpdates(msSleepBetweenServerUpdates);
        messageQueueSizeInBytes(messageQueueSizeInBytes);
        maxNbMessagesPerUpdate(maxNbMessagesPerUpdate);
        _malloc(_malloc);
        realloc(realloc);
        _free(_free);
        mm_context(mm_context);
        input_handler(input_handler);
        input_handler_context(input_handler_context);
        logFilename(logFilename);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public RMTSettings set(RMTSettings src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link RMTSettings} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTSettings malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link RMTSettings} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTSettings calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link RMTSettings} instance allocated with {@link BufferUtils}. */
    public static RMTSettings create() {
        return new RMTSettings(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link RMTSettings} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static RMTSettings create(long address) {
        return address == NULL ? null : new RMTSettings(address, null);
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link RMTSettings.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link RMTSettings} instance allocated on the thread-local {@link MemoryStack}. */
    public static RMTSettings mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link RMTSettings} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RMTSettings callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link RMTSettings} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link RMTSettings} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSettings callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTSettings.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #port}. */
    public static short nport(long struct) { return memGetShort(struct + RMTSettings.PORT); }
    /** Unsafe version of {@link #limit_connections_to_localhost}. */
    public static int nlimit_connections_to_localhost(long struct) { return memGetInt(struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates}. */
    public static int nmsSleepBetweenServerUpdates(long struct) { return memGetInt(struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES); }
    /** Unsafe version of {@link #messageQueueSizeInBytes}. */
    public static int nmessageQueueSizeInBytes(long struct) { return memGetInt(struct + RMTSettings.MESSAGEQUEUESIZEINBYTES); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate}. */
    public static int nmaxNbMessagesPerUpdate(long struct) { return memGetInt(struct + RMTSettings.MAXNBMESSAGESPERUPDATE); }
    /** Unsafe version of {@link #_malloc}. */
    public static RMTMalloc n_malloc(long struct) { return RMTMalloc.create(memGetAddress(struct + RMTSettings._MALLOC)); }
    /** Unsafe version of {@link #realloc}. */
    public static RMTRealloc nrealloc(long struct) { return RMTRealloc.create(memGetAddress(struct + RMTSettings.REALLOC)); }
    /** Unsafe version of {@link #_free}. */
    public static RMTFree n_free(long struct) { return RMTFree.create(memGetAddress(struct + RMTSettings._FREE)); }
    /** Unsafe version of {@link #mm_context}. */
    public static long nmm_context(long struct) { return memGetAddress(struct + RMTSettings.MM_CONTEXT); }
    /** Unsafe version of {@link #input_handler}. */
    public static RMTInputHandler ninput_handler(long struct) { return RMTInputHandler.create(memGetAddress(struct + RMTSettings.INPUT_HANDLER)); }
    /** Unsafe version of {@link #input_handler_context}. */
    public static long ninput_handler_context(long struct) { return memGetAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT); }
    /** Unsafe version of {@link #logFilename}. */
    public static ByteBuffer nlogFilename(long struct) { return memByteBufferNT1(memGetAddress(struct + RMTSettings.LOGFILENAME)); }
    /** Unsafe version of {@link #logFilenameString}. */
    public static String nlogFilenameString(long struct) { return memASCII(memGetAddress(struct + RMTSettings.LOGFILENAME)); }

    /** Unsafe version of {@link #port(short) port}. */
    public static void nport(long struct, short value) { memPutShort(struct + RMTSettings.PORT, value); }
    /** Unsafe version of {@link #limit_connections_to_localhost(int) limit_connections_to_localhost}. */
    public static void nlimit_connections_to_localhost(long struct, int value) { memPutInt(struct + RMTSettings.LIMIT_CONNECTIONS_TO_LOCALHOST, value); }
    /** Unsafe version of {@link #msSleepBetweenServerUpdates(int) msSleepBetweenServerUpdates}. */
    public static void nmsSleepBetweenServerUpdates(long struct, int value) { memPutInt(struct + RMTSettings.MSSLEEPBETWEENSERVERUPDATES, value); }
    /** Unsafe version of {@link #messageQueueSizeInBytes(int) messageQueueSizeInBytes}. */
    public static void nmessageQueueSizeInBytes(long struct, int value) { memPutInt(struct + RMTSettings.MESSAGEQUEUESIZEINBYTES, value); }
    /** Unsafe version of {@link #maxNbMessagesPerUpdate(int) maxNbMessagesPerUpdate}. */
    public static void nmaxNbMessagesPerUpdate(long struct, int value) { memPutInt(struct + RMTSettings.MAXNBMESSAGESPERUPDATE, value); }
    /** Unsafe version of {@link #_malloc(RMTMallocI) _malloc}. */
    public static void n_malloc(long struct, RMTMallocI value) { memPutAddress(struct + RMTSettings._MALLOC, value.address()); }
    /** Unsafe version of {@link #realloc(RMTReallocI) realloc}. */
    public static void nrealloc(long struct, RMTReallocI value) { memPutAddress(struct + RMTSettings.REALLOC, value.address()); }
    /** Unsafe version of {@link #_free(RMTFreeI) _free}. */
    public static void n_free(long struct, RMTFreeI value) { memPutAddress(struct + RMTSettings._FREE, value.address()); }
    /** Unsafe version of {@link #mm_context(long) mm_context}. */
    public static void nmm_context(long struct, long value) { memPutAddress(struct + RMTSettings.MM_CONTEXT, check(value)); }
    /** Unsafe version of {@link #input_handler(RMTInputHandlerI) input_handler}. */
    public static void ninput_handler(long struct, RMTInputHandlerI value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER, value.address()); }
    /** Unsafe version of {@link #input_handler_context(long) input_handler_context}. */
    public static void ninput_handler_context(long struct, long value) { memPutAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT, check(value)); }
    /** Unsafe version of {@link #logFilename(ByteBuffer) logFilename}. */
    public static void nlogFilename(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + RMTSettings.LOGFILENAME, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + RMTSettings._MALLOC));
        check(memGetAddress(struct + RMTSettings.REALLOC));
        check(memGetAddress(struct + RMTSettings._FREE));
        check(memGetAddress(struct + RMTSettings.MM_CONTEXT));
        check(memGetAddress(struct + RMTSettings.INPUT_HANDLER));
        check(memGetAddress(struct + RMTSettings.INPUT_HANDLER_CONTEXT));
        check(memGetAddress(struct + RMTSettings.LOGFILENAME));
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

    /** An array of {@link RMTSettings} structs. */
    public static class Buffer extends StructBuffer<RMTSettings, Buffer> implements NativeResource {

        /**
         * Creates a new {@link RMTSettings.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RMTSettings#SIZEOF}, and its mark will be undefined.
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
        protected RMTSettings newInstance(long address) {
            return new RMTSettings(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code port} field. */
        @NativeType("rmtU16")
        public short port() { return RMTSettings.nport(address()); }
        /** Returns the value of the {@code limit_connections_to_localhost} field. */
        @NativeType("rmtBool")
        public int limit_connections_to_localhost() { return RMTSettings.nlimit_connections_to_localhost(address()); }
        /** Returns the value of the {@code msSleepBetweenServerUpdates} field. */
        @NativeType("rmtU32")
        public int msSleepBetweenServerUpdates() { return RMTSettings.nmsSleepBetweenServerUpdates(address()); }
        /** Returns the value of the {@code messageQueueSizeInBytes} field. */
        @NativeType("rmtU32")
        public int messageQueueSizeInBytes() { return RMTSettings.nmessageQueueSizeInBytes(address()); }
        /** Returns the value of the {@code maxNbMessagesPerUpdate} field. */
        @NativeType("rmtU32")
        public int maxNbMessagesPerUpdate() { return RMTSettings.nmaxNbMessagesPerUpdate(address()); }
        /** Returns the value of the {@code _malloc} field. */
        @NativeType("rmtMalloc")
        public RMTMalloc _malloc() { return RMTSettings.n_malloc(address()); }
        /** Returns the value of the {@code realloc} field. */
        @NativeType("rmtRealloc")
        public RMTRealloc realloc() { return RMTSettings.nrealloc(address()); }
        /** Returns the value of the {@code _free} field. */
        @NativeType("rmtFreePtr")
        public RMTFree _free() { return RMTSettings.n_free(address()); }
        /** Returns the value of the {@code mm_context} field. */
        @NativeType("void *")
        public long mm_context() { return RMTSettings.nmm_context(address()); }
        /** Returns the value of the {@code input_handler} field. */
        @NativeType("rmtInputHandlerPtr")
        public RMTInputHandler input_handler() { return RMTSettings.ninput_handler(address()); }
        /** Returns the value of the {@code input_handler_context} field. */
        @NativeType("void *")
        public long input_handler_context() { return RMTSettings.ninput_handler_context(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code logFilename} field. */
        @NativeType("rmtPStr")
        public ByteBuffer logFilename() { return RMTSettings.nlogFilename(address()); }
        /** Decodes the null-terminated string pointed to by the {@code logFilename} field. */
        @NativeType("rmtPStr")
        public String logFilenameString() { return RMTSettings.nlogFilenameString(address()); }

        /** Sets the specified value to the {@code port} field. */
        public RMTSettings.Buffer port(@NativeType("rmtU16") short value) { RMTSettings.nport(address(), value); return this; }
        /** Sets the specified value to the {@code limit_connections_to_localhost} field. */
        public RMTSettings.Buffer limit_connections_to_localhost(@NativeType("rmtBool") int value) { RMTSettings.nlimit_connections_to_localhost(address(), value); return this; }
        /** Sets the specified value to the {@code msSleepBetweenServerUpdates} field. */
        public RMTSettings.Buffer msSleepBetweenServerUpdates(@NativeType("rmtU32") int value) { RMTSettings.nmsSleepBetweenServerUpdates(address(), value); return this; }
        /** Sets the specified value to the {@code messageQueueSizeInBytes} field. */
        public RMTSettings.Buffer messageQueueSizeInBytes(@NativeType("rmtU32") int value) { RMTSettings.nmessageQueueSizeInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code maxNbMessagesPerUpdate} field. */
        public RMTSettings.Buffer maxNbMessagesPerUpdate(@NativeType("rmtU32") int value) { RMTSettings.nmaxNbMessagesPerUpdate(address(), value); return this; }
        /** Sets the specified value to the {@code _malloc} field. */
        public RMTSettings.Buffer _malloc(@NativeType("rmtMalloc") RMTMallocI value) { RMTSettings.n_malloc(address(), value); return this; }
        /** Sets the specified value to the {@code realloc} field. */
        public RMTSettings.Buffer realloc(@NativeType("rmtRealloc") RMTReallocI value) { RMTSettings.nrealloc(address(), value); return this; }
        /** Sets the specified value to the {@code _free} field. */
        public RMTSettings.Buffer _free(@NativeType("rmtFreePtr") RMTFreeI value) { RMTSettings.n_free(address(), value); return this; }
        /** Sets the specified value to the {@code mm_context} field. */
        public RMTSettings.Buffer mm_context(@NativeType("void *") long value) { RMTSettings.nmm_context(address(), value); return this; }
        /** Sets the specified value to the {@code input_handler} field. */
        public RMTSettings.Buffer input_handler(@NativeType("rmtInputHandlerPtr") RMTInputHandlerI value) { RMTSettings.ninput_handler(address(), value); return this; }
        /** Sets the specified value to the {@code input_handler_context} field. */
        public RMTSettings.Buffer input_handler_context(@NativeType("void *") long value) { RMTSettings.ninput_handler_context(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code logFilename} field. */
        public RMTSettings.Buffer logFilename(@NativeType("rmtPStr") ByteBuffer value) { RMTSettings.nlogFilename(address(), value); return this; }

    }

}