/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the frame API of <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>. */
public class LZ4Frame {

    /** Version number. */
    public static final int LZ4F_VERSION = 100;

    /** Maximum header size. */
    public static final int LZ4F_HEADER_SIZE_MAX = 19;

    /**
     * {@code LZ4F_blockSizeID_t}
     * 
     * <p>The larger the block size, the (slightly) better the compression ratio, though there are diminishing returns. Larger blocks also increase memory usage
     * on both compression and decompression sides.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_default default}</li>
     * <li>{@link #LZ4F_max64KB max64KB}</li>
     * <li>{@link #LZ4F_max256KB max256KB}</li>
     * <li>{@link #LZ4F_max1MB max1MB}</li>
     * <li>{@link #LZ4F_max4MB max4MB}</li>
     * </ul>
     */
    public static final int
        LZ4F_default  = 0,
        LZ4F_max64KB  = 4,
        LZ4F_max256KB = 5,
        LZ4F_max1MB   = 6,
        LZ4F_max4MB   = 7;

    /**
     * {@code LZ4F_blockMode_t}
     * 
     * <p>Linked blocks sharply reduce inefficiencies when using small blocks, they compress better. However, some LZ4 decoders are only compatible with
     * independent blocks</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_blockLinked blockLinked}</li>
     * <li>{@link #LZ4F_blockIndependent blockIndependent}</li>
     * </ul>
     */
    public static final int
        LZ4F_blockLinked      = 0,
        LZ4F_blockIndependent = 1;

    /**
     * {@code LZ4F_contentChecksum_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_noContentChecksum noContentChecksum}</li>
     * <li>{@link #LZ4F_contentChecksumEnabled contentChecksumEnabled}</li>
     * </ul>
     */
    public static final int
        LZ4F_noContentChecksum      = 0,
        LZ4F_contentChecksumEnabled = 1;

    /**
     * {@code LZ4F_blockChecksum_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_noBlockChecksum noBlockChecksum}</li>
     * <li>{@link #LZ4F_blockChecksumEnabled blockChecksumEnabled}</li>
     * </ul>
     */
    public static final int
        LZ4F_noBlockChecksum      = 0,
        LZ4F_blockChecksumEnabled = 1;

    /**
     * {@code LZ4F_frameType_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LZ4F_frame frame}</li>
     * <li>{@link #LZ4F_skippableFrame skippableFrame}</li>
     * </ul>
     */
    public static final int
        LZ4F_frame          = 0,
        LZ4F_skippableFrame = 1;

    static { LibLZ4.initialize(); }

    protected LZ4Frame() {
        throw new UnsupportedOperationException();
    }

    // --- [ LZ4F_isError ] ---

    /** Unsafe version of: {@link #LZ4F_isError isError} */
    public static native int nLZ4F_isError(long code);

    /**
     * Tells if a {@code LZ4F_errorCode_t} function result is an error code
     *
     * @param code 
     */
    @NativeType("unsigned")
    public static boolean LZ4F_isError(@NativeType("LZ4F_errorCode_t") long code) {
        return nLZ4F_isError(code) != 0;
    }

    // --- [ LZ4F_getErrorName ] ---

    /** Unsafe version of: {@link #LZ4F_getErrorName getErrorName} */
    public static native long nLZ4F_getErrorName(long code);

    /**
     * Return error code string; useful for debugging.
     *
     * @param code 
     */
    @Nullable
    @NativeType("const char *")
    public static String LZ4F_getErrorName(@NativeType("LZ4F_errorCode_t") long code) {
        long __result = nLZ4F_getErrorName(code);
        return memASCIISafe(__result);
    }

    // --- [ LZ4F_compressionLevel_max ] ---

    public static native int LZ4F_compressionLevel_max();

    // --- [ LZ4F_compressFrameBound ] ---

    /** Unsafe version of: {@link #LZ4F_compressFrameBound compressFrameBound} */
    public static native long nLZ4F_compressFrameBound(long srcSize, long preferencesPtr);

    /**
     * Returns the maximum possible size of a frame compressed with {@link #LZ4F_compressFrame compressFrame} given {@code srcSize} content and preferences.
     * 
     * <p>Note: this result is only usable with {@link #LZ4F_compressFrame compressFrame}, not with multi-segments compression.</p>
     *
     * @param srcSize        
     * @param preferencesPtr 
     */
    @NativeType("size_t")
    public static long LZ4F_compressFrameBound(@NativeType("size_t") long srcSize, @Nullable @NativeType("const LZ4F_preferences_t *") LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrameBound(srcSize, memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_compressFrame ] ---

    /**
     * Unsafe version of: {@link #LZ4F_compressFrame compressFrame}
     *
     * @param dstCapacity MUST be &ge; {@link #LZ4F_compressFrameBound compressFrameBound}{@code (srcSize, preferencesPtr)}
     */
    public static native long nLZ4F_compressFrame(long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long preferencesPtr);

    /**
     * Compress an entire {@code srcBuffer} into a valid LZ4 frame.
     * 
     * <p>The {@code LZ4F_preferences_t} structure is optional: you can provide {@code NULL} as argument. All preferences will be set to default.</p>
     *
     * @param dstBuffer      
     * @param srcBuffer      
     * @param preferencesPtr 
     *
     * @return number of bytes written into {@code dstBuffer} or an error code if it fails (can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressFrame(@NativeType("void *") ByteBuffer dstBuffer, @NativeType("const void *") ByteBuffer srcBuffer, @Nullable @NativeType("const LZ4F_preferences_t *") LZ4FPreferences preferencesPtr) {
        return nLZ4F_compressFrame(memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(preferencesPtr));
    }

    // --- [ LZ4F_getVersion ] ---

    @NativeType("unsigned")
    public static native int LZ4F_getVersion();

    // --- [ LZ4F_createCompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_createCompressionContext createCompressionContext} */
    public static native long nLZ4F_createCompressionContext(long cctxPtr, int version);

    /**
     * The first thing to do is to create a {@code compressionContext} object, which will be used in all compression operations. This is achieved using
     * {@code LZ4F_createCompressionContext()}, which takes as argument a version.
     * 
     * <p>The function will provide a pointer to a fully allocated {@code LZ4F_cctx} object. Object can release its memory using {@link #LZ4F_freeCompressionContext freeCompressionContext};</p>
     *
     * @param cctxPtr 
     * @param version MUST be {@link #LZ4F_VERSION VERSION}. It is intended to track potential version mismatch, notably when using DLL. Must be:<br><table><tr><td>{@link #LZ4F_VERSION VERSION}</td></tr></table>
     *
     * @return if {@code != zero}, there was an error during context creation.
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createCompressionContext(@NativeType("LZ4F_cctx **") PointerBuffer cctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(cctxPtr, 1);
        }
        return nLZ4F_createCompressionContext(memAddress(cctxPtr), version);
    }

    // --- [ LZ4F_freeCompressionContext ] ---

    public static native long nLZ4F_freeCompressionContext(long cctx);

    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_freeCompressionContext(@NativeType("LZ4F_cctx *") long cctx) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_freeCompressionContext(cctx);
    }

    // --- [ LZ4F_compressBegin ] ---

    /**
     * Unsafe version of: {@link #LZ4F_compressBegin compressBegin}
     *
     * @param dstCapacity must be &ge; {@link #LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes
     */
    public static native long nLZ4F_compressBegin(long cctx, long dstBuffer, long dstCapacity, long prefsPtr);

    /**
     * Will write the frame header into {@code dstBuffer}.
     *
     * @param cctx      
     * @param dstBuffer 
     * @param prefsPtr  optional: you can provide {@code NULL} as argument, all preferences will then be set to default
     *
     * @return number of bytes written into {@code dstBuffer} for the header or an error code (which can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressBegin(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("const LZ4F_preferences_t *") LZ4FPreferences prefsPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressBegin(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressBound ] ---

    /** Unsafe version of: {@link #LZ4F_compressBound compressBound} */
    public static native long nLZ4F_compressBound(long srcSize, long prefsPtr);

    /**
     * Provides {@code dstCapacity} given a {@code srcSize} to guarantee operation success in worst case situations.
     * 
     * <p>Result is always the same for a {@code srcSize} and {@code prefsPtr}, so it can be trusted to size reusable buffers.</p>
     * 
     * <p>When {@code srcSize==0}, {@code LZ4F_compressBound()} provides an upper bound for {@link #LZ4F_flush flush} and {@link #LZ4F_compressEnd compressEnd} operations.</p>
     *
     * @param srcSize  
     * @param prefsPtr optional: you can provide {@code NULL} as argument, preferences will be set to cover worst case scenario
     */
    @NativeType("size_t")
    public static long LZ4F_compressBound(@NativeType("size_t") long srcSize, @Nullable @NativeType("const LZ4F_preferences_t *") LZ4FPreferences prefsPtr) {
        return nLZ4F_compressBound(srcSize, memAddressSafe(prefsPtr));
    }

    // --- [ LZ4F_compressUpdate ] ---

    /** Unsafe version of: {@link #LZ4F_compressUpdate compressUpdate} */
    public static native long nLZ4F_compressUpdate(long cctx, long dstBuffer, long dstCapacity, long srcBuffer, long srcSize, long cOptPtr);

    /**
     * {@code LZ4F_compressUpdate()} can be called repetitively to compress as much data as necessary.
     * 
     * <p>An important rule is that {@code dstCapacity} MUST be large enough to ensure operation success even in worst case situations. This value is provided by
     * {@link #LZ4F_compressBound compressBound}. If this condition is not respected, {@code LZ4F_compress()} will fail (result is an {@code errorCode}).</p>
     * 
     * <p>{@code LZ4F_compressUpdate()} doesn't guarantee error recovery. When an error occurs, compression context must be freed or resized.</p>
     *
     * @param cctx      
     * @param dstBuffer 
     * @param srcBuffer 
     * @param cOptPtr   optional: {@code NULL} can be provided, in which case all options are set to default
     *
     * @return number of bytes written into {@code dstBuffer} (it can be zero, meaning input data was just buffered) or an error code if it fails (which can be tested
     *         using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_compressUpdate(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("const void *") ByteBuffer srcBuffer, @Nullable @NativeType("const LZ4F_compressOptions_t *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressUpdate(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddress(srcBuffer), srcBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_flush ] ---

    /**
     * Unsafe version of: {@link #LZ4F_flush flush}
     *
     * @param dstCapacity must be large enough to ensure the operation will be successful
     */
    public static native long nLZ4F_flush(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /**
     * When data must be generated and sent immediately, without waiting for a block to be completely filled, it's possible to call {@link #LZ4F_flush flush}. It will
     * immediately compress any data buffered within {@code cctx}.
     *
     * @param cctx      
     * @param dstBuffer 
     * @param cOptPtr   optional: it's possible to provide {@code NULL}, all options will be set to default
     *
     * @return number of bytes written into {@code dstBuffer} (it can be zero, which means there was no data stored within {@code cctx}) or an error code if it fails
     *         (which can be tested using {@link #LZ4F_isError isError})
     */
    @NativeType("size_t")
    public static long LZ4F_flush(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("const LZ4F_compressOptions_t *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_flush(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_compressEnd ] ---

    /** Unsafe version of: {@link #LZ4F_compressEnd compressEnd} */
    public static native long nLZ4F_compressEnd(long cctx, long dstBuffer, long dstCapacity, long cOptPtr);

    /**
     * To properly finish an LZ4 frame, invoke {@link #LZ4F_compressEnd compressEnd}. It will flush whatever data remained within {@code cctx} (like {@link #LZ4F_flush flush}) and properly finalize
     * the frame, with an {@code endMark} and a {@code checksum}.
     *
     * @param cctx      
     * @param dstBuffer 
     * @param cOptPtr   optional: {@code NULL} can be provided, in which case all options will be set to default
     *
     * @return number of bytes written into {@code dstBuffer} (necessarily &ge; 4 ({@code endMark}), or 8 if optional frame checksum is enabled) or an error code if
     *         it fails (which can be tested using {@link #LZ4F_isError isError}).
     *         
     *         <p>A successful call to {@link #LZ4F_compressEnd compressEnd} makes {@code cctx} available again for another compression task.</p>
     */
    @NativeType("size_t")
    public static long LZ4F_compressEnd(@NativeType("LZ4F_cctx *") long cctx, @NativeType("void *") ByteBuffer dstBuffer, @Nullable @NativeType("const LZ4F_compressOptions_t *") LZ4FCompressOptions cOptPtr) {
        if (CHECKS) {
            check(cctx);
        }
        return nLZ4F_compressEnd(cctx, memAddress(dstBuffer), dstBuffer.remaining(), memAddressSafe(cOptPtr));
    }

    // --- [ LZ4F_createDecompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_createDecompressionContext createDecompressionContext} */
    public static native long nLZ4F_createDecompressionContext(long dctxPtr, int version);

    /**
     * Create an {@code LZ4F_dctx} object, to track all decompression operations.
     * 
     * <p>The function provides a pointer to an allocated and initialized {@code LZ4F_dctx} object. {@code dctx} memory can be released using
     * {@link #LZ4F_freeDecompressionContext freeDecompressionContext}.</p>
     *
     * @param dctxPtr 
     * @param version must be:<br><table><tr><td>{@link #LZ4F_VERSION VERSION}</td></tr></table>
     *
     * @return an errorCode, which can be tested using {@link #LZ4F_isError isError}
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_createDecompressionContext(@NativeType("LZ4F_dctx **") PointerBuffer dctxPtr, @NativeType("unsigned") int version) {
        if (CHECKS) {
            check(dctxPtr, 1);
        }
        return nLZ4F_createDecompressionContext(memAddress(dctxPtr), version);
    }

    // --- [ LZ4F_freeDecompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_freeDecompressionContext freeDecompressionContext} */
    public static native long nLZ4F_freeDecompressionContext(long dctx);

    /**
     * Frees an {@code LZ4F_dctx} object.
     *
     * @param dctx 
     *
     * @return an errorCode, which can be tested using {@link #LZ4F_isError isError}.
     *         
     *         <p>The result of {@code LZ4F_freeDecompressionContext()} is indicative of the current state of {@code decompressionContext} when being released. That is,
     *         it should be {@code == 0} if decompression has been completed fully and correctly.</p>
     */
    @NativeType("LZ4F_errorCode_t")
    public static long LZ4F_freeDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        return nLZ4F_freeDecompressionContext(dctx);
    }

    // --- [ LZ4F_getFrameInfo ] ---

    /** Unsafe version of: {@link #LZ4F_getFrameInfo getFrameInfo} */
    public static native long nLZ4F_getFrameInfo(long dctx, long frameInfoPtr, long srcBuffer, long srcSizePtr);

    /**
     * This function extracts frame parameters (max {@code blockSize}, {@code dictID}, etc.). Its usage is optional.
     * 
     * <p>Extracted information is typically useful for allocation and dictionary. This function works in 2 situations:</p>
     * 
     * <ul>
     * <li>At the beginning of a new frame, in which case it will decode information from {@code srcBuffer}, starting the decoding process.
     * 
     * <p>Input size must be large enough to successfully decode the entire frame header. Frame header size is variable, but is guaranteed to be &le;
     * {@link #LZ4F_HEADER_SIZE_MAX HEADER_SIZE_MAX} bytes. It's allowed to provide more input data than this minimum.</p></li>
     * <li>After decoding has been started. In which case, no input is read, frame parameters are extracted from {@code dctx}.</li>
     * <li>If decoding has barely started, but not yet extracted information from header, {@code LZ4F_getFrameInfo()} will fail.</li>
     * </ul>
     * 
     * <p>The number of bytes consumed from {@code srcBuffer} will be updated within {@code *srcSizePtr} (necessarily &le; original value). Decompression must
     * resume from {@code (srcBuffer + *srcSizePtr)}.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ol>
     * <li>in case of error, {@code dctx} is not modified. Decoding operation can resume from beginning safely</li>
     * <li>frame parameters are <i>copied into</i> an already allocated {@code LZ4F_frameInfo_t} structure</li>
     * </ol>
     *
     * @param dctx         
     * @param frameInfoPtr 
     * @param srcBuffer    
     * @param srcSizePtr   
     *
     * @return an hint about how many srcSize bytes LZ4F_decompress() expects for next call, or an error code which can be tested using LZ4F_isError()
     */
    @NativeType("size_t")
    public static long LZ4F_getFrameInfo(@NativeType("LZ4F_dctx *") long dctx, @NativeType("LZ4F_frameInfo_t *") LZ4FFrameInfo frameInfoPtr, @NativeType("const void *") ByteBuffer srcBuffer, @NativeType("size_t *") PointerBuffer srcSizePtr) {
        if (CHECKS) {
            check(dctx);
            check(srcSizePtr, 1);
            check(srcBuffer, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4F_getFrameInfo(dctx, frameInfoPtr.address(), memAddress(srcBuffer), memAddress(srcSizePtr));
    }

    // --- [ LZ4F_decompress ] ---

    /** Unsafe version of: {@link #LZ4F_decompress decompress} */
    public static native long nLZ4F_decompress(long dctx, long dstBuffer, long dstSizePtr, long srcBuffer, long srcSizePtr, long dOptPtr);

    /**
     * Call this function repetitively to regenerate compressed data from {@code srcBuffer}. The function will attempt to decode up to {@code *srcSizePtr}
     * bytes from {@code srcBuffer}, into {@code dstBuffer} of capacity {@code *dstSizePtr}.
     * 
     * <p>The number of bytes regenerated into {@code dstBuffer} is provided within {@code *dstSizePtr} (necessarily &le; original value).</p>
     * 
     * <p>The number of bytes consumed from {@code srcBuffer} is provided within {@code *srcSizePtr} (necessarily &le; original value). Number of bytes consumed
     * can be &lt; number of bytes provided. It typically happens when {@code dstBuffer} is not large enough to contain all decoded data. Unconsumed source
     * data must be presented again in subsequent invocations.</p>
     * 
     * <p>{@code dstBuffer} content is expected to be flushed between each invocation, as its content will be overwritten. {@code dstBuffer} itself can be
     * changed at will between each consecutive function invocation.</p>
     * 
     * <p>After a frame is fully decoded, {@code dctx} can be used again to decompress another frame.</p>
     * 
     * <p>After a decompression error, use {@link #LZ4F_resetDecompressionContext resetDecompressionContext} before re-using {@code dctx}, to return to clean state.</p>
     *
     * @param dctx       
     * @param dstBuffer  
     * @param dstSizePtr 
     * @param srcBuffer  
     * @param srcSizePtr 
     * @param dOptPtr    
     *
     * @return a hint of how many {@code srcSize} bytes {@code LZ4F_decompress()} expects for next call.
     *         
     *         <p>Schematically, it's the size of the current (or remaining) compressed block + header of next block. Respecting the hint provides some small speed
     *         benefit, because it skips intermediate buffers. This is just a hint though, it's always possible to provide any {@code srcSize}. When a frame is fully
     *         decoded, return will be 0 (no more data expected).</p>
     *         
     *         <p>If decompression failed, return is an error code, which can be tested using {@link #LZ4F_isError isError}.</p>
     */
    @NativeType("size_t")
    public static long LZ4F_decompress(@NativeType("LZ4F_dctx *") long dctx, @NativeType("void *") ByteBuffer dstBuffer, @NativeType("size_t *") PointerBuffer dstSizePtr, @NativeType("const void *") ByteBuffer srcBuffer, @NativeType("size_t *") PointerBuffer srcSizePtr, @NativeType("const LZ4F_decompressOptions_t *") LZ4FDecompressOptions dOptPtr) {
        if (CHECKS) {
            check(dctx);
            check(dstSizePtr, 1);
            check(dstBuffer, dstSizePtr.get(dstSizePtr.position()));
            check(srcSizePtr, 1);
            check(srcBuffer, srcSizePtr.get(srcSizePtr.position()));
        }
        return nLZ4F_decompress(dctx, memAddress(dstBuffer), memAddress(dstSizePtr), memAddress(srcBuffer), memAddress(srcSizePtr), dOptPtr.address());
    }

    // --- [ LZ4F_resetDecompressionContext ] ---

    /** Unsafe version of: {@link #LZ4F_resetDecompressionContext resetDecompressionContext} */
    public static native void nLZ4F_resetDecompressionContext(long dctx);

    /**
     * In case of an error, the context is left in "undefined" state. In which case, it's necessary to reset it, before re-using it.
     * 
     * <p>This method can also be used to abruptly stop an unfinished decompression, and start a new one using the same context.</p>
     *
     * @param dctx 
     */
    public static void LZ4F_resetDecompressionContext(@NativeType("LZ4F_dctx *") long dctx) {
        if (CHECKS) {
            check(dctx);
        }
        nLZ4F_resetDecompressionContext(dctx);
    }

}