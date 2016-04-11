/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Bindings to the AWT native interface (jawt.h).
 * 
 * <p>The AWT native interface allows a native C or C++ application a means by which to access native structures in AWT. This is to facilitate moving legacy
 * C and C++ applications to Java and to target the needs of the community who, at present, wish to do their own native rendering to canvases for
 * performance reasons. Standard extensions such as Java3D also require a means to access the underlying native data structures of AWT.</p>
 * 
 * <h3>AWT Native Drawing Surface (JAWT_DrawingSurface)</h3>
 * 
 * <p>For each platform, there is a native drawing surface structure. This platform-specific structure can be found in {@code jawt_md.h}. See
 * {@link JAWTX11DrawingSurfaceInfo} for the Linux platform, {@link JAWTWin32DrawingSurfaceInfo} for the Windows platform and {@link #JAWT_MACOSX_USE_CALAYER MACOSX_USE_CALAYER} for the OS X
 * platform.</p>
 */
public class JAWTFunctions {

	/** JAWT versions. */
	public static final int
		JAWT_VERSION_1_3 = 0x10003,
		JAWT_VERSION_1_4 = 0x10004,
		JAWT_VERSION_1_7 = 0x10007;

	/**
	 * When calling {@link #JAWT_GetAWT GetAWT} with a JAWT version less than 1.7, you must pass this flag or you will not be able to get a valid drawing surface and {@link #JAWT_GetAWT GetAWT}
	 * will return false. This is to maintain compatibility with applications that used the interface with Java 6 which had multiple rendering models. This
	 * flag is not necessary when JAWT version 1.7 or greater is used as this is the only supported rendering mode.
	 * 
	 * <p>When the native Cocoa toolkit is in use, the pointer stored in {@code JAWT_DrawingSurfaceInfo->platformInfo} points to a {@code NSObject} that conforms
	 * to the {@code JAWT_SurfaceLayers} protocol. Setting the layer property of this object will cause the specified layer to be overlaid on the Component's
	 * rectangle. If the window the Component belongs to has a {@code CALayer} attached to it, this layer will be accessible via the {@code windowLayer}
	 * property.</p>
	 * 
	 * <pre><code>&#64;protocol JAWT_SurfaceLayers
    &#64;property (readwrite, retain) CALayer *layer;
    &#64;property (readonly) CALayer *windowLayer;
&#64;end</code></pre>
	 */
	public static final int JAWT_MACOSX_USE_CALAYER = 0x10008;

	/** Bitmask values returned by {@code Lock()}. */
	public static final int
		JAWT_LOCK_ERROR           = 0x1,
		JAWT_LOCK_CLIP_CHANGED    = 0x2,
		JAWT_LOCK_BOUNDS_CHANGED  = 0x4,
		JAWT_LOCK_SURFACE_CHANGED = 0x8;

	static { Library.initialize(); }

	protected JAWTFunctions() {
		throw new UnsupportedOperationException();
	}

	private static final SharedLibrary JAWT = Library.loadNative("jawt");

	/** Contains the function pointers loaded from the jawt {@link SharedLibrary}. */
	public static final class Functions {

		private Functions() {}

		/** Function address. */
		public static final long
			GetAWT = apiGetFunctionAddress(JAWT, Pointer.BITS64 || Platform.get() != Platform.WINDOWS ? "JAWT_GetAWT" : "_JAWT_GetAWT@8");

	}

	/** Returns the jawt {@link SharedLibrary}. */
	public static SharedLibrary getLibrary() {
		return JAWT;
	}

	// --- [ JAWT_GetAWT ] ---

	/**
	 * Returns the AWT native structure.
	 *
	 * @param awt the target {@code JAWT} struct
	 *
	 * @return {@code JNI_FALSE} if an error occurs
	 */
	public static native boolean nJAWT_GetAWT(long __functionAddress, long awt);

	/**
	 * Returns the AWT native structure.
	 *
	 * @param awt the target {@code JAWT} struct
	 *
	 * @return {@code JNI_FALSE} if an error occurs
	 */
	public static boolean nJAWT_GetAWT(long awt) {
		long __functionAddress = Functions.GetAWT;
		return nJAWT_GetAWT(__functionAddress, awt);
	}

	/**
	 * Returns the AWT native structure.
	 *
	 * @param awt the target {@code JAWT} struct
	 *
	 * @return {@code JNI_FALSE} if an error occurs
	 */
	public static boolean JAWT_GetAWT(JAWT awt) {
		return nJAWT_GetAWT(awt.address());
	}

	// --- [ JAWT_DrawingSurface_Lock ] ---

	/**
	 * Locks the surface of the target component for native rendering. When finished drawing, the surface must be unlocked with {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock}.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the surface to lock
	 *
	 * @return a bitmask with one or more of the following values:
	 *         
	 *         <ul>
	 *         <li>{@link #JAWT_LOCK_ERROR LOCK_ERROR} - When an error has occurred and the surface could not be locked.</li>
	 *         <li>{@link #JAWT_LOCK_CLIP_CHANGED LOCK_CLIP_CHANGED} - When the clip region has changed.</li>
	 *         <li>{@link #JAWT_LOCK_BOUNDS_CHANGED LOCK_BOUNDS_CHANGED} - When the bounds of the surface have changed.</li>
	 *         <li>{@link #JAWT_LOCK_SURFACE_CHANGED LOCK_SURFACE_CHANGED} - When the surface itself has changed</li>
	 *         </ul>
	 */
	public static int nJAWT_DrawingSurface_Lock(long __functionAddress, long ds) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		return callPI(__functionAddress, ds);
	}

	/**
	 * Locks the surface of the target component for native rendering. When finished drawing, the surface must be unlocked with {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock}.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the surface to lock
	 *
	 * @return a bitmask with one or more of the following values:
	 *         
	 *         <ul>
	 *         <li>{@link #JAWT_LOCK_ERROR LOCK_ERROR} - When an error has occurred and the surface could not be locked.</li>
	 *         <li>{@link #JAWT_LOCK_CLIP_CHANGED LOCK_CLIP_CHANGED} - When the clip region has changed.</li>
	 *         <li>{@link #JAWT_LOCK_BOUNDS_CHANGED LOCK_BOUNDS_CHANGED} - When the bounds of the surface have changed.</li>
	 *         <li>{@link #JAWT_LOCK_SURFACE_CHANGED LOCK_SURFACE_CHANGED} - When the surface itself has changed</li>
	 *         </ul>
	 */
	public static int JAWT_DrawingSurface_Lock(long __functionAddress, JAWTDrawingSurface ds) {
		return nJAWT_DrawingSurface_Lock(__functionAddress, ds.address());
	}

	// --- [ JAWT_DrawingSurface_GetDrawingSurfaceInfo ] ---

	/**
	 * Returns the drawing surface info.
	 * 
	 * <p>The value returned may be cached, but the values may change if additional calls to {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} or {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock} are made.
	 * {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} must be called before this can return a valid value.</p>
	 * 
	 * <p>When finished with the returned value, {@link #JAWT_DrawingSurface_FreeDrawingSurfaceInfo DrawingSurface_FreeDrawingSurfaceInfo} must be called.</p>
	 *
	 * @param __functionAddress the function address
	 * @param ds                the {@link JAWTDrawingSurface} to free
	 *
	 * @return {@code NULL} if an error has occurred.
	 */
	public static long nJAWT_DrawingSurface_GetDrawingSurfaceInfo(long __functionAddress, long ds) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		return callPP(__functionAddress, ds);
	}

	/**
	 * Returns the drawing surface info.
	 * 
	 * <p>The value returned may be cached, but the values may change if additional calls to {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} or {@link #JAWT_DrawingSurface_Unlock DrawingSurface_Unlock} are made.
	 * {@link #JAWT_DrawingSurface_Lock DrawingSurface_Lock} must be called before this can return a valid value.</p>
	 * 
	 * <p>When finished with the returned value, {@link #JAWT_DrawingSurface_FreeDrawingSurfaceInfo DrawingSurface_FreeDrawingSurfaceInfo} must be called.</p>
	 *
	 * @param __functionAddress the function address
	 * @param ds                the {@link JAWTDrawingSurface} to free
	 *
	 * @return {@code NULL} if an error has occurred.
	 */
	public static JAWTDrawingSurfaceInfo JAWT_DrawingSurface_GetDrawingSurfaceInfo(long __functionAddress, JAWTDrawingSurface ds) {
		long __result = nJAWT_DrawingSurface_GetDrawingSurfaceInfo(__functionAddress, ds.address());
		return JAWTDrawingSurfaceInfo.create(__result);
	}

	// --- [ JAWT_DrawingSurface_FreeDrawingSurfaceInfo ] ---

	/**
	 * Frees the drawing surface info.
	 *
	 * @param __functionAddress the function address
	 * @param dsi               the {@link JAWTDrawingSurfaceInfo} to free
	 */
	public static void nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(long __functionAddress, long dsi) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		callPV(__functionAddress, dsi);
	}

	/**
	 * Frees the drawing surface info.
	 *
	 * @param __functionAddress the function address
	 * @param dsi               the {@link JAWTDrawingSurfaceInfo} to free
	 */
	public static void JAWT_DrawingSurface_FreeDrawingSurfaceInfo(long __functionAddress, JAWTDrawingSurfaceInfo dsi) {
		nJAWT_DrawingSurface_FreeDrawingSurfaceInfo(__functionAddress, dsi.address());
	}

	// --- [ JAWT_DrawingSurface_Unlock ] ---

	/**
	 * Unlocks the drawing surface of the target component for native rendering.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the surface to unlock
	 */
	public static void nJAWT_DrawingSurface_Unlock(long __functionAddress, long ds) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		callPV(__functionAddress, ds);
	}

	/**
	 * Unlocks the drawing surface of the target component for native rendering.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the surface to unlock
	 */
	public static void JAWT_DrawingSurface_Unlock(long __functionAddress, JAWTDrawingSurface ds) {
		nJAWT_DrawingSurface_Unlock(__functionAddress, ds.address());
	}

	// --- [ JAWT_GetDrawingSurface ] ---

	/**
	 * Returns a drawing surface from a target {@code jobject}. This value may be cached.
	 * 
	 * <p>{@link #JAWT_FreeDrawingSurface FreeDrawingSurface} must be called when finished with the returned {@link JAWTDrawingSurface}.</p>
	 *
	 * @param __functionAddress the function address
	 * @param target            must be a {@link java.awt.Component Component} (should be a {@link java.awt.Canvas Canvas} or {@link java.awt.Window Window} for native rendering)
	 *
	 * @return {@code NULL} if an error has occurred
	 */
	public static native long nJAWT_GetDrawingSurface(long __functionAddress, Object target);

	/**
	 * Returns a drawing surface from a target {@code jobject}. This value may be cached.
	 * 
	 * <p>{@link #JAWT_FreeDrawingSurface FreeDrawingSurface} must be called when finished with the returned {@link JAWTDrawingSurface}.</p>
	 *
	 * @param __functionAddress the function address
	 * @param target            must be a {@link java.awt.Component Component} (should be a {@link java.awt.Canvas Canvas} or {@link java.awt.Window Window} for native rendering)
	 *
	 * @return {@code NULL} if an error has occurred
	 */
	public static JAWTDrawingSurface JAWT_GetDrawingSurface(long __functionAddress, Object target) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		long __result = nJAWT_GetDrawingSurface(__functionAddress, target);
		return JAWTDrawingSurface.create(__result);
	}

	// --- [ JAWT_FreeDrawingSurface ] ---

	/**
	 * Frees the drawing surface allocated in {@link #JAWT_GetDrawingSurface GetDrawingSurface}.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the {@link JAWTDrawingSurface} to free
	 */
	public static void nJAWT_FreeDrawingSurface(long __functionAddress, long ds) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		callPV(__functionAddress, ds);
	}

	/**
	 * Frees the drawing surface allocated in {@link #JAWT_GetDrawingSurface GetDrawingSurface}.
	 *
	 * @param __functionAddress the function address
	 * @param ds                the {@link JAWTDrawingSurface} to free
	 */
	public static void JAWT_FreeDrawingSurface(long __functionAddress, JAWTDrawingSurface ds) {
		nJAWT_FreeDrawingSurface(__functionAddress, ds.address());
	}

	// --- [ JAWT_Lock ] ---

	/**
	 * Locks the entire AWT for synchronization purposes.
	 *
	 * @param __functionAddress the function address
	 */
	public static native void nJAWT_Lock(long __functionAddress);

	/**
	 * Locks the entire AWT for synchronization purposes.
	 *
	 * @param __functionAddress the function address
	 */
	public static void JAWT_Lock(long __functionAddress) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		nJAWT_Lock(__functionAddress);
	}

	// --- [ JAWT_Unlock ] ---

	/**
	 * Unlocks the entire AWT for synchronization purposes.
	 *
	 * @param __functionAddress the function address
	 */
	public static native void nJAWT_Unlock(long __functionAddress);

	/**
	 * Unlocks the entire AWT for synchronization purposes.
	 *
	 * @param __functionAddress the function address
	 */
	public static void JAWT_Unlock(long __functionAddress) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		nJAWT_Unlock(__functionAddress);
	}

	// --- [ JAWT_GetComponent ] ---

	/**
	 * Returns a reference to a {@code java.awt.Component Component} from a native platform handle. On Windows, this corresponds to an {@code HWND}; on
	 * Solaris and Linux, this is a {@code Drawable}. For other platforms, see the appropriate machine-dependent header file for a description. The reference
	 * returned by this function is a local reference that is only valid in this environment. This function returns a {@code NULL} reference if no component could be
	 * found with matching platform information.
	 *
	 * @param __functionAddress the function address
	 * @param platformInfo      the native platform handle
	 */
	public static native Object nJAWT_GetComponent(long __functionAddress, long platformInfo);

	/**
	 * Returns a reference to a {@code java.awt.Component Component} from a native platform handle. On Windows, this corresponds to an {@code HWND}; on
	 * Solaris and Linux, this is a {@code Drawable}. For other platforms, see the appropriate machine-dependent header file for a description. The reference
	 * returned by this function is a local reference that is only valid in this environment. This function returns a {@code NULL} reference if no component could be
	 * found with matching platform information.
	 *
	 * @param __functionAddress the function address
	 * @param platformInfo      the native platform handle
	 */
	public static Object JAWT_GetComponent(long __functionAddress, ByteBuffer platformInfo) {
		if ( CHECKS )
			checkPointer(__functionAddress);
		return nJAWT_GetComponent(__functionAddress, memAddress(platformInfo));
	}

}