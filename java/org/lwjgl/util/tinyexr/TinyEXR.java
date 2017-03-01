/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://github.com/syoyo/tinyexr">Tiny OpenEXR</a> image library.
 * 
 * <p>tinyexr is a small, single header-only library to load and save OpenEXR(.exr) images.</p>
 */
public class TinyEXR {

	/** Error codes. */
	public static final int
		TINYEXR_SUCCESS                    = 0,
		TINYEXR_ERROR_INVALID_MAGIC_NUMBER = -1,
		TINYEXR_ERROR_INVALID_EXR_VERSION  = -2,
		TINYEXR_ERROR_INVALID_ARGUMENT     = -3,
		TINYEXR_ERROR_INVALID_DATA         = -4,
		TINYEXR_ERROR_INVALID_FILE         = -5,
		TINYEXR_ERROR_INVALID_PARAMETER    = -5,
		TINYEXR_ERROR_CANT_OPEN_FILE       = -6,
		TINYEXR_ERROR_UNSUPPORTED_FORMAT   = -7,
		TINYEXR_ERROR_INVALID_HEADER       = -8;

	/** Pixel types. */
	public static final int
		TINYEXR_PIXELTYPE_UINT  = 0,
		TINYEXR_PIXELTYPE_HALF  = 1,
		TINYEXR_PIXELTYPE_FLOAT = 2;

	/**  */
	public static final int TINYEXR_MAX_ATTRIBUTES = 128;

	/** Compression types. */
	public static final int
		TINYEXR_COMPRESSIONTYPE_NONE = 0,
		TINYEXR_COMPRESSIONTYPE_RLE  = 1,
		TINYEXR_COMPRESSIONTYPE_ZIPS = 2,
		TINYEXR_COMPRESSIONTYPE_ZIP  = 3,
		TINYEXR_COMPRESSIONTYPE_PIZ  = 4,
		TINYEXR_COMPRESSIONTYPE_ZFP  = 128;

	/** ZFP compression types. */
	public static final int
		TINYEXR_ZFP_COMPRESSIONTYPE_RATE      = 0,
		TINYEXR_ZFP_COMPRESSIONTYPE_PRECISION = 1,
		TINYEXR_ZFP_COMPRESSIONTYPE_ACCURACY  = 2;

	/** Tile level types. */
	public static final int
		TINYEXR_TILE_ONE_LEVEL     = 0,
		TINYEXR_TILE_MIPMAP_LEVELS = 1,
		TINYEXR_TILE_RIPMAP_LEVELS = 2;

	/** Tile rounding types. */
	public static final int
		TINYEXR_TILE_ROUND_DOWN = 0,
		TINYEXR_TILE_ROUND_UP   = 1;

	static { Library.loadSystem(System::load, System::loadLibrary, TinyEXR.class, Platform.mapLibraryNameBundled("lwjgl_tinyexr")); }

	protected TinyEXR() {
		throw new UnsupportedOperationException();
	}

	// --- [ InitEXRHeader ] ---

	/** Unsafe version of: {@link #InitEXRHeader} */
	public static native void nInitEXRHeader(long exr_header);

	/**
	 * Initialize {@link EXRHeader} struct.
	 *
	 * @param exr_header 
	 */
	public static void InitEXRHeader(EXRHeader exr_header) {
		nInitEXRHeader(exr_header.address());
	}

	// --- [ InitEXRImage ] ---

	/** Unsafe version of: {@link #InitEXRImage} */
	public static native void nInitEXRImage(long exr_image);

	/**
	 * Initialize {@link EXRImage} struct.
	 *
	 * @param exr_image 
	 */
	public static void InitEXRImage(EXRImage exr_image) {
		nInitEXRImage(exr_image.address());
	}

	// --- [ FreeEXRHeader ] ---

	/** Unsafe version of: {@link #FreeEXRHeader} */
	public static native int nFreeEXRHeader(long exr_header);

	/**
	 * Free's internal data of {@link EXRHeader} struct
	 *
	 * @param exr_header 
	 */
	public static int FreeEXRHeader(EXRHeader exr_header) {
		return nFreeEXRHeader(exr_header.address());
	}

	// --- [ FreeEXRImage ] ---

	/** Unsafe version of: {@link #FreeEXRImage} */
	public static native int nFreeEXRImage(long exr_image);

	/**
	 * Free's internal data of {@link EXRImage} struct
	 *
	 * @param exr_image 
	 */
	public static int FreeEXRImage(EXRImage exr_image) {
		if ( CHECKS )
			EXRImage.validate(exr_image.address());
		return nFreeEXRImage(exr_image.address());
	}

	// --- [ ParseEXRVersionFromFile ] ---

	/** Unsafe version of: {@link #ParseEXRVersionFromFile} */
	public static native int nParseEXRVersionFromFile(long version, long filename);

	/**
	 * Parse EXR version header of a file.
	 *
	 * @param version  
	 * @param filename 
	 */
	public static int ParseEXRVersionFromFile(EXRVersion version, ByteBuffer filename) {
		if ( CHECKS )
			checkNT1(filename);
		return nParseEXRVersionFromFile(version.address(), memAddress(filename));
	}

	/**
	 * Parse EXR version header of a file.
	 *
	 * @param version  
	 * @param filename 
	 */
	public static int ParseEXRVersionFromFile(EXRVersion version, CharSequence filename) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nParseEXRVersionFromFile(version.address(), memAddress(filenameEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ParseEXRVersionFromMemory ] ---

	/** Unsafe version of: {@link #ParseEXRVersionFromMemory} */
	public static native int nParseEXRVersionFromMemory(long version, long memory, long size);

	/**
	 * Parse EXR version header from memory-mapped EXR data.
	 *
	 * @param version 
	 * @param memory  
	 */
	public static int ParseEXRVersionFromMemory(EXRVersion version, ByteBuffer memory) {
		return nParseEXRVersionFromMemory(version.address(), memAddress(memory), memory.remaining());
	}

	// --- [ ParseEXRHeaderFromFile ] ---

	/** Unsafe version of: {@link #ParseEXRHeaderFromFile} */
	public static native int nParseEXRHeaderFromFile(long header, long version, long filename, long err);

	/**
	 * Parse single-part OpenEXR header from a file and initialize {@link EXRHeader}.
	 *
	 * @param header   
	 * @param version  
	 * @param filename 
	 * @param err      
	 */
	public static int ParseEXRHeaderFromFile(EXRHeader header, EXRVersion version, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			checkNT1(filename);
			check(err, 1);
		}
		return nParseEXRHeaderFromFile(header.address(), version.address(), memAddress(filename), memAddress(err));
	}

	/**
	 * Parse single-part OpenEXR header from a file and initialize {@link EXRHeader}.
	 *
	 * @param header   
	 * @param version  
	 * @param filename 
	 * @param err      
	 */
	public static int ParseEXRHeaderFromFile(EXRHeader header, EXRVersion version, CharSequence filename, PointerBuffer err) {
		if ( CHECKS )
			check(err, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nParseEXRHeaderFromFile(header.address(), version.address(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ParseEXRHeaderFromMemory ] ---

	/** Unsafe version of: {@link #ParseEXRHeaderFromMemory} */
	public static native int nParseEXRHeaderFromMemory(long header, long version, long memory, long size, long err);

	/**
	 * Parse single-part OpenEXR header from a memory and initialize {@link EXRHeader}.
	 *
	 * @param header  
	 * @param version 
	 * @param memory  
	 * @param err     
	 */
	public static int ParseEXRHeaderFromMemory(EXRHeader header, EXRVersion version, ByteBuffer memory, PointerBuffer err) {
		if ( CHECKS )
			check(err, 1);
		return nParseEXRHeaderFromMemory(header.address(), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
	}

	// --- [ ParseEXRMultipartHeaderFromFile ] ---

	/** Unsafe version of: {@link #ParseEXRMultipartHeaderFromFile} */
	public static native int nParseEXRMultipartHeaderFromFile(long headers, long num_headers, long version, long filename, long err);

	/**
	 * Parse multi-part OpenEXR headers from a file and initialize {@link EXRHeader}* array.
	 *
	 * @param headers     
	 * @param num_headers 
	 * @param version     
	 * @param filename    
	 * @param err         
	 */
	public static int ParseEXRMultipartHeaderFromFile(PointerBuffer headers, IntBuffer num_headers, EXRVersion version, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, 1);
			check(num_headers, 1);
			checkNT1(filename);
			check(err, 1);
		}
		return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), memAddress(filename), memAddress(err));
	}

	/**
	 * Parse multi-part OpenEXR headers from a file and initialize {@link EXRHeader}* array.
	 *
	 * @param headers     
	 * @param num_headers 
	 * @param version     
	 * @param filename    
	 * @param err         
	 */
	public static int ParseEXRMultipartHeaderFromFile(PointerBuffer headers, IntBuffer num_headers, EXRVersion version, CharSequence filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, 1);
			check(num_headers, 1);
			check(err, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nParseEXRMultipartHeaderFromFile(memAddress(headers), memAddress(num_headers), version.address(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ ParseEXRMultipartHeaderFromMemory ] ---

	/** Unsafe version of: {@link #ParseEXRMultipartHeaderFromMemory} */
	public static native int nParseEXRMultipartHeaderFromMemory(long headers, long num_headers, long version, long memory, long size, long err);

	/**
	 * Parse multi-part OpenEXR headers from a memory and initialize {@link EXRHeader}* array.
	 *
	 * @param headers     
	 * @param num_headers 
	 * @param version     
	 * @param memory      
	 * @param err         
	 */
	public static int ParseEXRMultipartHeaderFromMemory(PointerBuffer headers, IntBuffer num_headers, EXRVersion version, ByteBuffer memory, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, 1);
			check(num_headers, 1);
			check(err, 1);
		}
		return nParseEXRMultipartHeaderFromMemory(memAddress(headers), memAddress(num_headers), version.address(), memAddress(memory), memory.remaining(), memAddress(err));
	}

	// --- [ LoadEXRImageFromFile ] ---

	/** Unsafe version of: {@link #LoadEXRImageFromFile} */
	public static native int nLoadEXRImageFromFile(long image, long header, long filename, long err);

	/**
	 * Loads single-part OpenEXR image from a file.
	 * 
	 * <p>Application must setup {@link #ParseEXRHeaderFromFile} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param image    
	 * @param header   
	 * @param filename 
	 * @param err      
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRImageFromFile(EXRImage image, EXRHeader header, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			checkNT1(filename);
			check(err, 1);
			EXRHeader.validate(header.address());
		}
		return nLoadEXRImageFromFile(image.address(), header.address(), memAddress(filename), memAddress(err));
	}

	/**
	 * Loads single-part OpenEXR image from a file.
	 * 
	 * <p>Application must setup {@link #ParseEXRHeaderFromFile} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param image    
	 * @param header   
	 * @param filename 
	 * @param err      
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRImageFromFile(EXRImage image, EXRHeader header, CharSequence filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(err, 1);
			EXRHeader.validate(header.address());
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nLoadEXRImageFromFile(image.address(), header.address(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ LoadEXRImageFromMemory ] ---

	/** Unsafe version of: {@link #LoadEXRImageFromMemory} */
	public static native int nLoadEXRImageFromMemory(long image, long header, long memory, long size, long err);

	/**
	 * Loads single-part OpenEXR image from a memory.
	 * 
	 * <p>Application must setup {@link EXRHeader} with {@link #ParseEXRHeaderFromMemory} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param image  
	 * @param header 
	 * @param memory 
	 * @param err    
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRImageFromMemory(EXRImage image, EXRHeader header, ByteBuffer memory, PointerBuffer err) {
		if ( CHECKS ) {
			check(err, 1);
			EXRHeader.validate(header.address());
		}
		return nLoadEXRImageFromMemory(image.address(), header.address(), memAddress(memory), memory.remaining(), memAddress(err));
	}

	// --- [ LoadEXRMultipartImageFromFile ] ---

	/** Unsafe version of: {@link #LoadEXRMultipartImageFromFile} */
	public static native int nLoadEXRMultipartImageFromFile(long images, long headers, int num_parts, long filename, long err);

	/**
	 * Loads multi-part OpenEXR image from a file.
	 * 
	 * <p>Application must setup {@link #ParseEXRMultipartHeaderFromFile} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param images   
	 * @param headers  
	 * @param filename 
	 * @param err      
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRMultipartImageFromFile(EXRImage.Buffer images, PointerBuffer headers, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, images.remaining());
			checkNT1(filename);
			check(err, 1);
		}
		return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), memAddress(filename), memAddress(err));
	}

	/**
	 * Loads multi-part OpenEXR image from a file.
	 * 
	 * <p>Application must setup {@link #ParseEXRMultipartHeaderFromFile} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param images   
	 * @param headers  
	 * @param filename 
	 * @param err      
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRMultipartImageFromFile(EXRImage.Buffer images, PointerBuffer headers, CharSequence filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, images.remaining());
			check(err, 1);
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nLoadEXRMultipartImageFromFile(images.address(), memAddress(headers), images.remaining(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ LoadEXRMultipartImageFromMemory ] ---

	/** Unsafe version of: {@link #LoadEXRMultipartImageFromMemory} */
	public static native int nLoadEXRMultipartImageFromMemory(long images, long headers, int num_parts, long memory, long size, long err);

	/**
	 * Loads multi-part OpenEXR image from a memory.
	 * 
	 * <p>Application must setup {@link EXRHeader}* array with {@link #ParseEXRMultipartHeaderFromMemory} before calling this function.</p>
	 * 
	 * <p>Application can free EXRImage using {@link #FreeEXRImage}.</p>
	 *
	 * @param images  
	 * @param headers 
	 * @param memory  
	 * @param err     
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadEXRMultipartImageFromMemory(EXRImage.Buffer images, PointerBuffer headers, ByteBuffer memory, PointerBuffer err) {
		if ( CHECKS ) {
			check(headers, images.remaining());
			check(err, 1);
		}
		return nLoadEXRMultipartImageFromMemory(images.address(), memAddress(headers), images.remaining(), memAddress(memory), memory.remaining(), memAddress(err));
	}

	// --- [ SaveEXRImageToFile ] ---

	/** Unsafe version of: {@link #SaveEXRImageToFile} */
	public static native int nSaveEXRImageToFile(long image, long exr_header, long filename, long err);

	/**
	 * Saves multi-channel, single-frame OpenEXR image to a file.
	 *
	 * @param image      
	 * @param exr_header 
	 * @param filename   
	 * @param err        
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int SaveEXRImageToFile(EXRImage image, EXRHeader exr_header, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			checkNT1(filename);
			check(err, 1);
			EXRImage.validate(image.address());
			EXRHeader.validate(exr_header.address());
		}
		return nSaveEXRImageToFile(image.address(), exr_header.address(), memAddress(filename), memAddress(err));
	}

	/**
	 * Saves multi-channel, single-frame OpenEXR image to a file.
	 *
	 * @param image      
	 * @param exr_header 
	 * @param filename   
	 * @param err        
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int SaveEXRImageToFile(EXRImage image, EXRHeader exr_header, CharSequence filename, PointerBuffer err) {
		if ( CHECKS ) {
			check(err, 1);
			EXRImage.validate(image.address());
			EXRHeader.validate(exr_header.address());
		}
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nSaveEXRImageToFile(image.address(), exr_header.address(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ SaveEXRImageToMemory ] ---

	/** Unsafe version of: {@link #SaveEXRImageToMemory} */
	public static native long nSaveEXRImageToMemory(long image, long exr_header, long memory, long err);

	/**
	 * Saves multi-channel, single-frame OpenEXR image to a memory.
	 * 
	 * <p>Image is compressed using {@code EXRImage.compression} value.</p>
	 *
	 * @param image      
	 * @param exr_header 
	 * @param memory     
	 * @param err        
	 *
	 * @return the number of bytes if success or negative value and may set error string in {@code err} when there's an error
	 */
	public static long SaveEXRImageToMemory(EXRImage image, EXRHeader exr_header, PointerBuffer memory, PointerBuffer err) {
		if ( CHECKS ) {
			check(memory, 1);
			check(err, 1);
			EXRImage.validate(image.address());
			EXRHeader.validate(exr_header.address());
		}
		return nSaveEXRImageToMemory(image.address(), exr_header.address(), memAddress(memory), memAddress(err));
	}

	// --- [ LoadDeepEXR ] ---

	/** Unsafe version of: {@link #LoadDeepEXR} */
	public static native int nLoadDeepEXR(long out_image, long filename, long err);

	/**
	 * Loads single-frame OpenEXR deep image.
	 * 
	 * <p>Application must free memory of variables in {@code DeepImage(image, offset_table)}.</p>
	 *
	 * @param out_image 
	 * @param filename  
	 * @param err       
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadDeepEXR(DeepImage out_image, ByteBuffer filename, PointerBuffer err) {
		if ( CHECKS ) {
			checkNT1(filename);
			check(err, 1);
		}
		return nLoadDeepEXR(out_image.address(), memAddress(filename), memAddress(err));
	}

	/**
	 * Loads single-frame OpenEXR deep image.
	 * 
	 * <p>Application must free memory of variables in {@code DeepImage(image, offset_table)}.</p>
	 *
	 * @param out_image 
	 * @param filename  
	 * @param err       
	 *
	 * @return negative value and may set error string in {@code err} when there's an error
	 */
	public static int LoadDeepEXR(DeepImage out_image, CharSequence filename, PointerBuffer err) {
		if ( CHECKS )
			check(err, 1);
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer filenameEncoded = stack.ASCII(filename);
			return nLoadDeepEXR(out_image.address(), memAddress(filenameEncoded), memAddress(err));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

}